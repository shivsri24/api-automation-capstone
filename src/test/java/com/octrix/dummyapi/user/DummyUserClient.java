package com.octrix.dummyapi.user;

import com.octrix.dummyapi.post.DummyPostModel;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DummyUserClient {
    public Response getAllUsersResponse() {
        return given()
                .queryParam("limit",10)
                .header("app-id", System.getenv("app-id"))
                .get("https://dummyapi.io/data/v1/user");
    }

    public Response getAllUsersByMeResponse() {
        return given()
                .queryParam("created",1)
                .header("app-id", System.getenv("app-id"))
                .get("https://dummyapi.io/data/v1/user");
    }

    public Response createUser(DummyUserModel body){
        Response response = given()
                .contentType(ContentType.JSON)
                .header("app-id", System.getenv("app-id"))
                .body(body)
                .post("https://dummyapi.io/data/v1/user/create");

        response.then().log().body();
        return response;
    }
}