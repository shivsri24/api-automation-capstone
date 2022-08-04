package com.octrix.dummyapi.post;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class DummyPostModel {
    private String text;
    private String image;
    private String owner;
    private List<String> tags;
    private int likes;
    private String link;

    public DummyPostModel(Builder builder) {
        this.text= builder.text;
        this.image=builder.image;
        this.likes=builder.likes;
        this.owner=builder.owner;
        this.tags=builder.tags;
        this.link=builder.link;
    }

    public static class Builder{
        private String text;
        private String image;
        private String owner;
        @JsonProperty("tags")
        private List<String> tags;
        private int likes;
        private String link;
        public Builder(){
            text="Description of the post";
            image="https://image.shutterstock.com/image-vector/new-post-neon-text-video-600w-1444569020.jpg";
            likes=0;
            owner=System.getenv("app-id");
            tags=new ArrayList<>();
            link="https://image.shutterstock.com/image-vector/";
        }

        public DummyPostModel build(){
            DummyPostModel requestBody=new DummyPostModel(this);
            return requestBody;
        }

    }
}