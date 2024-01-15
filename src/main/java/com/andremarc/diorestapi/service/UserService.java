package com.andremarc.diorestapi.service;

import com.andremarc.diorestapi.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User user);
}
