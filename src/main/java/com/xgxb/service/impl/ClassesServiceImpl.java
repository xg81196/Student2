package com.xgxb.service.impl;


import com.xgxb.bean.Classes;
import com.xgxb.repository.ClassesRepository;
import com.xgxb.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService {


    @Autowired
    private ClassesRepository classesRepository;

    @Override
    public List<Classes> findAll() {
        return classesRepository.findAll();
    }

    @Override
    public List<Classes> findById(Integer cId) {
        return classesRepository.findById(cId);
    }
}
