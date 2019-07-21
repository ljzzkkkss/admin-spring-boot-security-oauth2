package com.wiscom.bus.app.server.mapper;

import com.wiscom.bus.app.server.model.User;

public interface UserMapper {
    User findByUsername(String username);
    void insert(User user);
    void update(User user);
    void delete(Long id);
}
