package org.JUnit.Intro.before.service;

import org.JUnit.Intro.before.User;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
    private static UserServiceImpl userService;
    private List<User> users;

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all ");
        userService = new UserServiceImpl();    }

    @BeforeEach
    void setUp() {
        System.out.println("SetUp method");
        users = new ArrayList<>();
        users.add(new User("Bob", 23));
        users.add(new User("Alice", 22));
        users.add(new User("John", 27));
    }


    @Test
    void checkEmptyList() {
        System.out.println("1");
        List<User> actual = userService.findAgeGreaterThan(new ArrayList<>(), 18);
        assertTrue(actual.isEmpty());
    }

    @Test
    void validUserCase_ok() {
        System.out.println("2");
        List<User> actual = userService.findAgeGreaterThan(users, 10);
        assertEquals(2, actual.size() - 1);
        assertTrue(actual.contains(new User("Bob", 23)));
        assertTrue(actual.contains(new User("Alice", 22)));

    }

    @Test
    void largeAge_ok() {
        System.out.println("3");
        List<User> actual = userService.findAgeGreaterThan(users, 81);
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all");
    }
}