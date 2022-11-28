package io.etuh.socialconnect;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.etuh.socialconnect.model.posts.Post;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

    RecyclerView recyclerView;
    List<Post> posts;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .connectTimeout(1, TimeUnit.MINUTES)
//                .readTimeout(15, TimeUnit.SECONDS)
//                .build();
//
//        Gson gson = new GsonBuilder().serializeNulls().setDateFormat(DateFormat.LONG).create();

        OkHttpClient client = new OkHttpClient();
        client.interceptors().add(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                okhttp3.Response response = chain.proceed(chain.request());
                // Do anything with response here
                return response;
            }
        });



        recyclerView = findViewById(R.id.recyclerView);
        posts = new ArrayList<>();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new Adapter(this, posts);
        recyclerView.setAdapter(adapter);

        requestPosts();
    }
        private void requestPosts() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
//                .client(client)
                .build();

        //        TypicodeAPI typicode = new TypicodeAPI("")

            TypicodeAPI typicodeAPI = retrofit.create(TypicodeAPI.class);

            Call<List<Post>> call = typicodeAPI.getPosts();

            call.enqueue(new Callback<List<Post>>() {
                @Override
                public void onResponse(Call<List<Post>>  call, Response<List<Post>> response) {
                    Log.d(TAG, "onResponse: Typicode: " + response.body());
                    Log.d(TAG, "onResponse: Server Response: " + response.toString());
                }

                @Override
                public void onFailure(Call<List<Post>>  call, Throwable t) {
                    Log.e(TAG, "onFailure: Unable to retrieve data: " + t.getMessage());
                    Toast.makeText(MainActivity.this, "An Error Occurred", Toast.LENGTH_SHORT).show();
                }
            });
        }


    private void RViewer(List<Post> posts) {
        Adapter adapter = new Adapter(this, posts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}