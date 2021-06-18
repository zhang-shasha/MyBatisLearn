package com.hbuas.Dao;

import com.hbuas.POJO.Blog;
import com.hbuas.Utils.IDutils;
import com.hbuas.Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlogMapperTest {
    @Test
    public void addBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("LearnVUE");
        blog.setAuthor("zhang");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);
        sqlSession.close();
    }
    @Test
    public void getBlogs(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap<>();
//        map.put("author","zhang");
        map.put("title","LearnVUE");
        List<Blog> blogList = mapper.getBlogs(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
    }
}
