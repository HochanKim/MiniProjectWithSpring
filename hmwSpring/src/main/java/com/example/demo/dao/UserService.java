package com.example.demo.dao;

import com.example.demo.model.entity.User;

import java.util.HashMap;

public interface UserService {
    User searchUser(HashMap<String,Object> map);
}
