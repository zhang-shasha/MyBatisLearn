package com.hbuas.Dao;

import com.hbuas.POJO.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    //获取老师及其所有学生
    Teacher getTeacher(@Param("tid") int id);
}
