package org.JUnit.Intro.before.service;

import org.JUnit.Intro.before.User;
import org.JUnit.Intro.before.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAgeGreaterThan(List<User> users, int age) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.getAge() > age) {
                result.add(user);
            }
        }
        return result;
    }
}
