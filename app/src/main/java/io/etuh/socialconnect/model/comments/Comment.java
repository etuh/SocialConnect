package io.etuh.socialconnect.model.comments;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="comment", strict = false)
public class Comment {
    @SuppressWarnings("SpellCheckingInspection")
    @Element(name="postid")
    private int postId;

    @Element(name="id")
    private int id;

    @Element(name="email")
    private String email;

    @Element(name="body")
    private String body;

    public Comment(){}

    public Comment(int postId, int id, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.email = email;
        this.body = body;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
