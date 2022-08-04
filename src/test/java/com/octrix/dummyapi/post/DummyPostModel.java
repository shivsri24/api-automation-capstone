package com.octrix.dummyapi.post;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.ArrayList;
import java.util.List;

public class DummyPostModel {
    private String text;
    private String image;
    private String owner;
    private List<String> tags;
    private int likes;

    public DummyPostModel(Builder builder) {
        this.text= builder.text;
        this.image=builder.image;
        this.likes=builder.likes;
        this.owner=builder.owner;
        this.tags=builder.tags;
    }

    public static class Builder{
        private String text;
        private String image;
        private String owner;
        private List<String> tags;
        private int likes;
        public Builder(){
            text="Description of the post";
            image="https://image.shutterstock.com/image-vector/new-post-neon-text-video-600w-1444569020.jpg";
            likes=0;
            owner=System.getenv("app-id");
            tags=new ArrayList<>();
        }

        public DummyPostModel build(){
            DummyPostModel requestBody=new DummyPostModel(this);
            return requestBody;
        }

    }
}