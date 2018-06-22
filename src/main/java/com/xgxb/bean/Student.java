package com.xgxb.bean;



import java.io.Serializable;

public class Student implements Serializable {

    private Integer s_id; //学生ID
    private String s_name; // 学生姓名
    private String s_sex; // 学生性别
    private String s_birth; // 学生生日
    private Classes classes; //学生所属班级对象


    public Student(Integer s_id, String s_name, String s_sex, String s_birth, Classes classes) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_sex = s_sex;
        this.s_birth = s_birth;
        this.classes = classes;
    }

    public Student() {
    }


    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public String getS_birth() {
        return s_birth;
    }

    public void setS_birth(String s_birth) {
        this.s_birth = s_birth;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_sex='" + s_sex + '\'' +
                ", s_birth='" + s_birth + '\'' +
                ", classes=" + classes +
                '}';
    }
}


