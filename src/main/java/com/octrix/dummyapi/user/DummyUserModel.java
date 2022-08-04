package com.octrix.dummyapi.user;

import lombok.Getter;

import java.util.UUID;

@Getter
public class DummyUserModel {
    private String firstName;
    private String lastName;
    private String email;

    public DummyUserModel(Builder builder) {
        this.firstName= builder.firstName;
        this.lastName= builder.lastName;
        this.email= builder.email;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String email;
        public Builder(){
            this.firstName="Shivansh";
            this.lastName="Srivastava";
            this.email= UUID.randomUUID()+"@gmail.com";
        }
        public Builder firstName(String firstName){
            this.firstName=firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName=lastName;
            return this;
        }

        public Builder email(String email){
            this.email=email;
            return this;
        }

        public DummyUserModel build(){
            DummyUserModel requestBody=new DummyUserModel(this);
            return requestBody;
        }
    }
}