package com.hbuas.Dao;

import com.hbuas.POJO.User;
import com.hbuas.Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        System.out.println("========================");
        User user2 = mapper.queryUserById(1);
        System.out.println(user2);
        System.out.println(user==user2);
        sqlSession.close();
    }
}
