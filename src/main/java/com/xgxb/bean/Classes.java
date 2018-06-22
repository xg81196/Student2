package com.xgxb.bean;


import lombok.*;

import java.io.Serializable;


public class Classes implements Serializable {


    private Integer class_id;  // 班级ID
    private String class_name;  // 班级名称

    public Classes() {
    }

    public Classes(Integer class_id, String class_name) {
        this.class_id = class_id;
        this.class_name = class_name;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "class_id=" + class_id +
                ", class_name='" + class_name + '\'' +
                '}';
    }
}
