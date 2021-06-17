package com.hbuas.Dao;

import com.hbuas.POJO.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //获取全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //分页查询
    List<User> getUserByLimit(Map<String,Integer> map);
}
