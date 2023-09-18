package com.example.f23comp1011tasks2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private  User newUser;
    @BeforeEach
    void setUp() {
        newUser = new User("fred@rocks.com", "Fred", "705-555-1234");
    }

    @Test
    void setEmail() {
        newUser.setEmail("fred@georgian.ca");
        assertEquals("fred@georgian.ca", newUser.getEmail()); // assertEquals(a, b) : 객체 A와 B가 같은 값을 가지는지 확인한다.
    }

    @Test
    void setInvalidEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            newUser.setEmail("");
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            newUser.setEmail("test");
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            newUser.setEmail(".@stuff");
        });
    }

    @Test
    void setUserName() {
        newUser.setUserName("Barney");
        assertEquals("Barney", newUser.getUserName());
    }

    @Test
    void setInvalidUserName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            newUser.setUserName("");
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            newUser.setUserName("     ");
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            newUser.setUserName("     ");
        });
    }

    @Test
    void setPhone() {
    }
}