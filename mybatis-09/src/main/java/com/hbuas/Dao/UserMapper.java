package com.hbuas.Dao;

import com.hbuas.POJO.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User queryUserById(@Param("id") int id);
}
