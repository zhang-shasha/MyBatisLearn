package com.hbuas.Dao;

import com.hbuas.POJO.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //获取全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //插入一个用户
    int addUser(User user);
    //修改一个用户
    int updateUser(User user);
    //删除一个用户
    int deleteUser(int id);
    //万能的Map的应用
    int addUser2(Map<String,Object> map);
    //模糊查询
    List<User> getUserLikes(String name);
}
