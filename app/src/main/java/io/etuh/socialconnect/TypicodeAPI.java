package io.etuh.socialconnect;

import java.util.List;

import io.etuh.socialconnect.model.posts.Post;
import retrofit2.Call;
import retrofit2.http.GET;

public interface TypicodeAPI {
//    String BASE_URL = "https://jsonplaceholder.typicode.com/";

    @GET("posts")
    Call<List<Post>> getPosts();




//    Call<Typicode> getPosts();
}
