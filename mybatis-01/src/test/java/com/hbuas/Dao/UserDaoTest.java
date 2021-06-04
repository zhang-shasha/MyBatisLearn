package com.hbuas.Dao;

import com.hbuas.POJO.User;
import com.hbuas.Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for(User user : userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

}
