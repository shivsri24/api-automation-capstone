package com.octrix.dummyapi.user;

import okhttp3.Response;

import java.io.IOException;

public class DummyUserFactory {
    /**
     * Factories are the interfaces provided to users and hiding all the core logics,
     * factory will expose methods for creating data.
     */
    DummyUserClient dummyUserClient = new DummyUserClient();

    public Response createUser(String firstname, String lastname, String email) throws IOException {
        return dummyUserClient.createUser(firstname, lastname, email);
    }
}
