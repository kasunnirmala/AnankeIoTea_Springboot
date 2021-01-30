package com.ananke.teafac.teafac.service;

import com.ananke.teafac.teafac.entity.BatchEntity;
import com.ananke.teafac.teafac.entity.TeaFactoryEntity;
import com.ananke.teafac.teafac.repository.TeaFactoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class TeaFactoryService {
    @Autowired
    TeaFactoryRepository teaFactoryRepository;


    public TeaFactoryEntity addTeaFactory(TeaFactoryEntity teaFactoryEntity) {
        return teaFactoryRepository.save(teaFactoryEntity);
    }

    public List<TeaFactoryEntity> getAllTeaFactories() {
        return teaFactoryRepository.findAll();
    }
}
