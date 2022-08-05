package com.octrix.dummyapi.post;

import okhttp3.*;

import java.io.IOException;

 class DummyPostClient {
    Response createPost() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n    " +
                "\"text\": \"This is the post description\",\n" +
                "\"image\": \"https://image.shutterstock.com/image-vector/new-post-neon-text-video-600w-1444569020.jpg\",\n" +
                "\"likes\": 0,\n" +
                "\"tags\": [\n        \"samplepost\"\n    ],\n" +
                "\"owner\": "+System.getenv("app-id")+"\n}");
        Request request = new Request.Builder()
                .url("https://dummyapi.io/data/v1/post/create")
                .addHeader("app-id", System.getenv("app-id"))
                .addHeader("Content-Type", "application/json")
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response;
    }

    Response getPost(String id) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://dummyapi.io/data/v1/post/"+id)
                .addHeader("app-id", System.getenv("app-id"))
                .addHeader("Content-Type", "application/json")
                .get()
                .build();
        Response response = client.newCall(request).execute();
        return response;
    }

    Response deletePost(String id) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://dummyapi.io/data/v1/post/"+id)
                .addHeader("app-id", System.getenv("app-id"))
                .addHeader("Content-Type", "application/json")
                .delete()
                .build();
        Response response = client.newCall(request).execute();
        return response;
    }
}