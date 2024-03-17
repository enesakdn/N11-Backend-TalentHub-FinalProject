package com.enesakdn.n11finaluserService.faker;

import com.enesakdn.n11finaluserService.entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserFaker {

    public User user() {
        User user = new User();
        user.setId(1L);
        user.setName("name1");
        user.setSurname("surname1");
        user.setBirthDate(LocalDate.parse("1990-01-01"));
        user.setUsername("user1");
        user.setPhoneNumber("1234567890");
        user.setEmail("user1@example.com");
        user.setLatitude(40.7128);
        user.setLongitude(-74.0060);
        return user;
    }

    public List<User> users() {
        User user1 = new User();
        user1.setId(1L);
        user1.setName("name1");
        user1.setSurname("surname1");
        user1.setBirthDate(LocalDate.parse("1990-01-01"));
        user1.setUsername("user1");
        user1.setPhoneNumber("1234567890");
        user1.setEmail("user1@example.com");
        user1.setLatitude(40.7128);
        user1.setLongitude(-74.0060);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("name2");
        user2.setSurname("surname2");
        user2.setBirthDate(LocalDate.parse("1995-05-05"));
        user2.setUsername("user2");
        user2.setPhoneNumber("0987654321");
        user2.setEmail("user2@example.com");
        user2.setLatitude(34.0522);
        user2.setLongitude(-118.2437);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        return users;
    }
}
