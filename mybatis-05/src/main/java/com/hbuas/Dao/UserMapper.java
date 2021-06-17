package com.hbuas.Dao;

import com.hbuas.POJO.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //获取全部用户
    @Select("select * from user")
    List<User> getUserList();
    //方法存在多个参数必须加上@Param("id")
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);
    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);
}
