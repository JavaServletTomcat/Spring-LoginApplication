package com.hainguyen.com.codegym.dao;

import com.hainguyen.model.Login;
import com.hainguyen.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users = new ArrayList<>();
    static {
        User u1 = new User("admin", "123123", "Jonly", "jonly@gmail.com", 18);
        User u2 = new User("user1", "123123", "Perter", "Perter@gmail.com", 18);
        User u3 = new User("user2", "123123", "Thomson", "Thomson@gmail.com", 18);
        User u4 = new User("user3", "123123", "Merry", "Merry@gmail.com", 18);
        User u5 = new User("user4", "123123", "Maria", "Maria@gmail.com", 18);
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
    }

    public static User checkLogin(Login login){
        for (User u : users){
            if (u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
