package com.wiscom.bus.app.server.service;

import com.wiscom.bus.app.server.model.User;

public interface UserService {
    User findByUsername(String username);
    void insert(User user);
    void update(User user);
    void delete(Long id);
}
