package com.yamaha.service;

import java.util.Optional;

import com.yamaha.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}

