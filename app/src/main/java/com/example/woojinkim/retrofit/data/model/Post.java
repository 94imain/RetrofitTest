package com.example.woojinkim.retrofit.data.model;

/**
 * Created by woojinkim on 2017. 10. 24..
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("pwd")
    @Expose
    private String pwd;

    public String getId() {
        return id;
    }


    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setId(String title) {
        this.id = title;
    }



    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                '}';
    }
}