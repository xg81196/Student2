package com.xgxb.repository;

import com.xgxb.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentRepository {


    /**
     * 查询全部学生信息
     * @return
     */
    List<Student> findAll();


    /**
     * 按ID查询学生信息
     * @param stuId
     * @return
     */
    Student findById(@Param("stuId") Integer stuId);


    /**
     * 删除学生信息
     * @param stuId
     * @return
     */
    Integer deleteStudent(@Param("stuId")Integer stuId);


    /**
     * 修改学生信息
     * @param student
     * @return
     */
    Integer updateStudent(@Param("student")Student student);


    /**
     * 添加一个学生信息
     * @param student
     * @return
     */
    Integer insertStuden(@Param("student") Student student);




}
