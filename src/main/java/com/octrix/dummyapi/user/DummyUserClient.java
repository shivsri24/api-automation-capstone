package com.octrix.dummyapi.user;

import okhttp3.*;

import java.io.IOException;

 class DummyUserClient {
     Response getAllUsersResponse() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://dummyapi.io/data/v1/user")
                .addHeader("app-id", System.getenv("app-id"))
                .addHeader("Content-Type", "application/json")
                .get()
                .build();
        okhttp3.Response response = client.newCall(request).execute();
        return response;
    }

    Response getAllUsersUnderMyAccountResponse(int id) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://dummyapi.io/data/v1/user?created="+id)
                .addHeader("app-id", System.getenv("app-id"))
                .addHeader("Content-Type", "application/json")
                .get()
                .build();
        okhttp3.Response response = client.newCall(request).execute();
        return response;
    }

    Response createUser(String firstname, String lastname, String email) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n" +
                "    \"firstName\" : "+firstname+",\n" +
                "    \"lastName\" : "+lastname+",\n" +
                "    \"email\" : "+email+"\n" +
                "}");
        Request request = new Request.Builder()
                .url("https://dummyapi.io/data/v1/user/create")
                .addHeader("app-id", System.getenv("app-id"))
                .addHeader("Content-Type", "application/json")
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response;
    }
}