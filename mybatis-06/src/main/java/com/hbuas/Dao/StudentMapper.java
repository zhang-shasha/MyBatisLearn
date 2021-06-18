package com.hbuas.Dao;

import com.hbuas.POJO.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    //查询所有的学生和以及对应老师信息
    List<Student> getStudentList();
    List<Student> getStudentList2();
}
