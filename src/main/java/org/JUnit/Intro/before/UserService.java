package org.JUnit.Intro.before;

import org.JUnit.Intro.before.service.UserServiceImpl;

import java.util.List;

public interface UserService {
    List<User> findAgeGreaterThan (List<User> users,int age);
}
