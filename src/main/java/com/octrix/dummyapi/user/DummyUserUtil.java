package com.octrix.dummyapi.user;

import io.restassured.response.Response;

public class DummyUserUtil {

    DummyUserClient dummyUserClient = new DummyUserClient();

    public DummyGetAllUserResponse dummyGetAllUsersResponse() {
        Response response = dummyUserClient.getAllUsersResponse();
        DummyGetAllUserResponse getAllUsersResponse = response.as(DummyGetAllUserResponse.class);
        getAllUsersResponse.setStatusCode(response.statusCode());
        return getAllUsersResponse;
    }

    public DummyGetAllUserResponse dummyGetAllUsersUnderMyAccountResponse() {
        Response response = dummyUserClient.getAllUsersUnderMyAccountResponse();
        DummyGetAllUserResponse getAllUsersUnderMyAccountResponse = response.as(DummyGetAllUserResponse.class);
        getAllUsersUnderMyAccountResponse.setStatusCode(response.statusCode());
        return getAllUsersUnderMyAccountResponse;
    }

    public DummyCreateUserResponse dummyCreateUserResponse(DummyUserModel body) {
        Response response = dummyUserClient.createUser(body);
        DummyCreateUserResponse createUserResponse = response.as(DummyCreateUserResponse.class);
        createUserResponse.setStatusCode(response.getStatusCode());
        return createUserResponse;
    }
}