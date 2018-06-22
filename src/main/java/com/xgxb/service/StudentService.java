package com.xgxb.service;


import com.xgxb.bean.Student;

import java.util.List;

public interface StudentService {

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
    Student findById(Integer stuId);


    /**
     * 删除学生信息
     * @param stuId
     * @return
     */
    Integer deleteStudent(Integer stuId);


    /**
     * 修改学生信息
     * @param student
     * @return
     */
    Integer updateStudent(Student student);


    /**
     * 添加一个学生信息
     * @param student
     * @return
     */
    Integer insertStuden(Student student);




}
