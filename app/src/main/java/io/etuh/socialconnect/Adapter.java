package io.etuh.socialconnect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import io.etuh.socialconnect.model.posts.Post;

public class Adapter extends RecyclerView.Adapter<ViewHolder>{
    private Context mcontext;
    private List<Post> posts;

    public Adapter(Context mcontext, List<Post> posts) {
        this.mcontext = mcontext;
        this.posts = posts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
        itemView =layoutInflater.inflate(R.layout.items,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post aPost = posts.get(position);
//       holder.getTextVH().setText(aPost.getPosts());
        holder.getTextVH().setText(aPost.getUserId());
        holder.getTextVHA().setText(aPost.getId());
        holder.getTextVHB().setText(aPost.getTitle());
        holder.getTextVHC().setText(aPost.getBody());

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

}
