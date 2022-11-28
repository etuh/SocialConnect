package io.etuh.socialconnect.model;

//import androidx.test.espresso.Root;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.util.List;

import io.etuh.socialconnect.model.comments.Comment;
import io.etuh.socialconnect.model.posts.Post;
import io.etuh.socialconnect.model.users.User;

@Root(name="typicode", strict = false)
public class Typicode implements Serializable {
    // string variables for our data
    // make sure that the variable name
    // must be similar to that of key value
    // which we are getting from our json file.

    @ElementList(inline=true, name="posts")
    private List<Post> posts;

    @ElementList(inline=true, name="comments")
    private List<Comment> comments;

    @ElementList(inline=true, name="users")
    private List<User> users;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}

