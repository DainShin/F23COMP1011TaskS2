package com.example.f23comp1011tasks2;

public class User {
    private String email, userName, phone;

    /**
     * This is the constructor, it will be called whenever we create
     * an instance of a User
     * @param email - must match valid email syntax
     * @param userName - what ever the user wishes to be called
     * @param phone - must align to the North American dialling plan
     */
    public User(String email, String userName, String phone) {  // ctrl+r
        setemail (email);
        setuserName (userName);
        setphone (phone);
    }
}
