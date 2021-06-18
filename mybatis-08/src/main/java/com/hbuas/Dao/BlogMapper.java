package com.hbuas.Dao;

import com.hbuas.POJO.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);
    //查询所有的Blogs，使用动态SQL形式
    List<Blog> getBlogs(Map map);
    //使用choose标签查询
    List<Blog> getBlogsChoose(Map map);
    //更新博客使用 SET标签
    int updateBlog(Map map);
}
