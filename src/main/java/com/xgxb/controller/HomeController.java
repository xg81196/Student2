package com.xgxb.controller;


import com.xgxb.bean.Classes;
import com.xgxb.bean.Student;
import com.xgxb.service.ClassesService;
import com.xgxb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassesService classesService;

    @RequestMapping(value = {"/","/home"})
    public String index(Model model){

        List<Student> studentList = studentService.findAll();
        List<Classes> classesList = classesService.findAll();

        for (Student student:studentList ) {
            if(student==null){
                studentList.remove(studentList);
            }  // classpath:templates/list.html
            for (Classes classes: classesList) {
                if(student.getClasses().getClass_id()==classes.getClass_id()){
                    student.getClasses().setClass_name(classes.getClass_name());
                }
            }
        }
        model.addAttribute("list",studentList);
        return "list";
    }


    @RequestMapping(value = "/toadd")
    public String toAdd(Model model){
        model.addAttribute("classList",classesService.findAll());
        return  "save";
    }


    @RequestMapping(value = "/student/save")
    public String addStudent(Student student, @RequestParam("cid")Integer cId){
        Classes classes = new Classes();
        classes.setClass_id(cId);
        student.setClasses(classes);
        studentService.insertStuden(student);
        return  "redirect:/";
    }



    @ResponseBody
    @RequestMapping(value = "/delete")
    public String delete(@RequestParam("id")Integer stu_id){
        return studentService.deleteStudent(stu_id) > 0 ?"删除成功":"删除失败";
    }


    @RequestMapping(value = "/toedit/{id}")
    public String toEdit(@PathVariable Integer id,Model model){
        model.addAttribute("student",studentService.findById(id));
        model.addAttribute("classList",classesService.findAll());
        return "edit";
    }

    @RequestMapping(value = "/toedit/edit")
    public String  update(Student student, @RequestParam("cid")Integer cId){
        Classes classes = new Classes();
        classes.setClass_id(cId);
        student.setClasses(classes);
        studentService.updateStudent(student);
        return "redirect:/home";
    }

}
