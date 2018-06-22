package com.xgxb.service.impl;

import com.xgxb.bean.Student;
import com.xgxb.repository.StudentRepository;
import com.xgxb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private  StudentRepository studentRepository;


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Integer stuId) {
        return studentRepository.findById(stuId);
    }

    @Override
    public Integer deleteStudent(Integer stuId) {
        return studentRepository.deleteStudent(stuId);
    }

    @Override
    public Integer updateStudent(Student student) {
        return studentRepository.updateStudent(student);
    }

    @Override
    public Integer insertStuden(Student student) {
        return studentRepository.insertStuden(student);
    }
}
