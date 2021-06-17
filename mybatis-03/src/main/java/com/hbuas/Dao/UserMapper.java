package com.hbuas.Dao;

import com.hbuas.POJO.User;

import java.util.List;

public interface UserMapper {
    //获取全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
}
