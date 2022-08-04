package com.octrix.dummyapi.post;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DummyPostClient {
    public Response createPost(DummyPostModel body){
        Response response = given()
                .contentType(ContentType.JSON)
                .header("app-id", System.getenv("app-id"))
                .body(body)
                .post("https://dummyapi.io/data/v1/post/create");

        response.then().log().body();
        return response;
    }

    public Response getPost(String id){
        return given()
                .header("app-id",System.getenv("app-id"))
                .pathParam("id",id)
                .get("https://dummyapi.io/data/v1/post/{id}");
    }

    public Response deletePost(String id){
        return given()
                .header("app-id",System.getenv("app-id"))
                .pathParam("id",id)
                .delete("https://dummyapi.io/data/v1/post/{id}");
    }
}