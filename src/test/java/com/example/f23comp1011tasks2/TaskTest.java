package com.example.f23comp1011tasks2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    Task task;
    User fred;
    @BeforeEach
    void setUp() {
        fred = new User("fred@rocks.com", "Freddie", "7055551234");
        task = new Task("Do Quiz", "See quiz in week2",
                LocalDate.of(20234,9,23),15, fred);

    }
    @Test
    void setTaskId() {
        task.setTaskID(1);
        assertEquals(1,task.getTaskID());
    }

}