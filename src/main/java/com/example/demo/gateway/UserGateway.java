package com.example.demo.gateway;

import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserGateway {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
}
