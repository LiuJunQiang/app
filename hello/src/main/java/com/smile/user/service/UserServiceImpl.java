package com.smile.user.service;

import com.smile.user.entity.User;
import com.smile.base.service.BaseServiceImpl;
import com.smile.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService<User, Long> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public JpaRepository<User, Long> getJpaRepository() {
        return this.userRepository;
    }
}
