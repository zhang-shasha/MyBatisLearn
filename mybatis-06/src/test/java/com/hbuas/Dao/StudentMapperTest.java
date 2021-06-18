package com.hbuas.Dao;

import com.hbuas.POJO.Student;
import com.hbuas.Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {
    @Test
    public void getAllStudents(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.getStudentList();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void getAllStudents2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.getStudentList2();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
