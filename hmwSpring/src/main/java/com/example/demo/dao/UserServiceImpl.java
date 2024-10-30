package com.example.demo.dao;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User searchUser(HashMap<String, Object> map) {
        return userMapper.selectUser(map);
    }
}
