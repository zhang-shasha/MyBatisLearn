package Dao;

import com.hbuas.Dao.StudentMapper;
import com.hbuas.Dao.TeacherMapper;
import com.hbuas.POJO.Student;
import com.hbuas.POJO.Teacher;
import com.hbuas.Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

}
