package com.xgxb.repository;

import com.xgxb.bean.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClassesRepository {


    /**
     * 查询全部班级信息
     * @return
     */
    List<Classes> findAll();


    /**
     * 按ID查询班级信息
     * @param cId
     * @return
     */
    List<Classes> findById(@Param("cId") Integer cId);



}
