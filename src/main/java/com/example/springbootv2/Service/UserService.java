package com.example.springbootv2.Service;

import com.example.springbootv2.model.User;

import java.util.List;

public interface UserService {

    List<User> getListUsers();

    void addUser(User user);

    User findById(Long id);

    void deleteUserById(Long id);

    void update(User user);
}
