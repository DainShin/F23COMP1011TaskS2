package com.example.f23comp1011tasks2;

import java.util.regex.Pattern;

public class User implements Comparable<User> {
    private String email, userName, phone;

    /**
     * This is the constructor, it will be called whenever we create
     * an instance of a User
     * @param email - must match valid email syntax
     * @param userName - what ever the user wishes to be called
     * @param phone - must align to the North American dialling plan
     */
    public User(String email, String userName, String phone) {  // ctrl+r
        setEmail (email);
        setUserName (userName);
        setPhone (phone);
    }

    // getters and setter
    public String getEmail() {
        return email;
    }

    public static boolean isEmailValid(String email) {
        final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
        return EMAIL_REGEX.matcher(email).matches();
    }
    public void setEmail(String email) {
        if(isEmailValid(email))
            this.email = email;
        else
            throw new IllegalArgumentException("email must match RFC822 pattern");
    }

    public String getUserName() {
        return userName;
    }

    /**
     * This set's the users name, it cannot be blank
     * @param userName - what ever the user wants it to be
     */
    public void setUserName(String userName) {
        userName = userName.trim(); // remove leading and trailing whitespaces
        if(userName.matches("[A-z1-9]+"))   // []+ : 안에 패턴이 하나이상
            this.userName = userName;
        else
            throw new IllegalArgumentException("username must have 1 character and/or number");
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        try {
            phone = phone.replaceAll("^[0-9]", "");

            // North American Dialling plan
            // 3 digits - area code [2-9][0-9]{2}
            // 3 digits - city code [2-9][0-9]{2}
            // 4 digits - can be anything [0-9]{4}
            //                        705       555    1234
            if (phone.matches("[2-9][0-9]{2}[2-9][0-9]{6}"))
                this.phone = phone;
            else
                throw new IllegalArgumentException("phone number example (705-555-1234)");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public String toString() {
        return String.format("%s (%s)", userName, email);
    }

    @Override
    public int compareTo(User otherUser) {
        return this.email.compareTo(otherUser.getEmail());
    }
}
