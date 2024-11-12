package com.example.demo.gateway.impl;

import com.example.demo.gateway.UserGateway;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserGatewayImpl implements UserGateway {

    @Autowired
    private UserService userService;

    @Override
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userService.findById(id);
    }

    @Override
    public User saveUser(User user) {
        return userService.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userService.deleteById(id);
    }
}
