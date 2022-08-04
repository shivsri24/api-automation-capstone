package com.octrix.dummyapi.post;

import io.restassured.response.Response;

public class DummyPostUtil {
    public DummyPostResponse createPost(DummyPostModel body){
        Response response=new DummyPostClient().createPost(body);
        DummyPostResponse postResponse=response.as(DummyPostResponse.class);
        postResponse.setStatusCode(response.statusCode());
        return postResponse;
    }

    public DummyPostResponse getPost(String id){
        Response response=new DummyPostClient().getPost(id);
        DummyPostResponse postResponse=response.as(DummyPostResponse.class);
        postResponse.setStatusCode(response.statusCode());
        return postResponse;
    }
}
