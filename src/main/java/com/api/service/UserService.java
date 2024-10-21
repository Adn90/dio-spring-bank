package com.api.service;

import com.api.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
