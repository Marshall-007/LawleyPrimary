package com.bttp.pojo;

public class Comment {
    private int comment_id;
    private String identityno;
    private String comment;
    private String postDate;
    private String postTime;

    public Comment() {
    }

    public Comment(int comment_id, String identityno, String comment, String postDate, String postTime) {
        this.comment_id = comment_id;
        this.identityno = identityno;
        this.comment = comment;
        this.postDate = postDate;
        this.postTime = postTime;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public String getIdentityno() {
        return identityno;
    }

    public void setIdentityno(String identityno) {
        this.identityno = identityno;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }
}
