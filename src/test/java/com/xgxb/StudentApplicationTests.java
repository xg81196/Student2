package com.xgxb;

import com.xgxb.bean.Classes;
import com.xgxb.bean.Student;
import com.xgxb.service.ClassesService;
import com.xgxb.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentApplicationTests {


	@Autowired
	ClassesService classesRepository;

	@Autowired
	StudentService studentRepository;

	@Test
	public void contextLoads() {
		List<Student> studentList = studentRepository.findAll();
		List<Classes> classesList = classesRepository.findAll();
		for (Student student:studentList ) {
			System.out.println(student.getClasses());
//			for (Classes classes: classesList) {
//
//				if(student.getClasses().getClass_id()==classes.getClass_id()){
//					student.getClasses().setClass_name(classes.getClass_name());
//				}
//			}
		}
//		studentList.forEach(System.out::println);

	}


}
