package com.octrix.dummyapi.user;

import okhttp3.Response;

import java.io.IOException;

public class DummyUserDataManager {
    /**
     * Data managers will provide data for particular entity.
     */
    DummyUserClient dummyUserClient = new DummyUserClient();

    public Response getAllUsers() throws IOException {
        return dummyUserClient.getAllUsersResponse();
    }

    public Response getAllUserUnderMyAccount(int id) throws IOException {
        return dummyUserClient.getAllUsersUnderMyAccountResponse(id);
    }
}
