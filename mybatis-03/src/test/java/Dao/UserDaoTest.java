package Dao;

import com.github.pagehelper.PageHelper;
import com.hbuas.Dao.UserMapper;
import com.hbuas.POJO.User;
import com.hbuas.Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void getAllUsers(){
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        //调用分页插件
        PageHelper.startPage(1,3);
        List<User> userList = userDao.getUserList();
        for(User user : userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Integer> map = new HashMap<>();
        map.put("startIndex",1);
        map.put("pageSize",2);
        List<User> userList = mapper.getUserByLimit(map);
        for(User user : userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

}
