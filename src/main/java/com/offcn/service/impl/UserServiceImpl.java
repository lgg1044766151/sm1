package com.offcn.service.impl;

import com.offcn.dao.UserDao;
import com.offcn.po.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public void updateUser(Long id, User user) {

    }

    @Override
    public void deleteUser(Long id) {

    }
}
