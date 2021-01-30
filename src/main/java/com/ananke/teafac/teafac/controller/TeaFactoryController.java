package com.ananke.teafac.teafac.controller;

import com.ananke.teafac.teafac.entity.TeaFactoryEntity;
import com.ananke.teafac.teafac.service.TeaFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/api/v1/tea-factory")
public class TeaFactoryController {
    @Autowired
    TeaFactoryService teaFactoryService;
    @GetMapping("/getAll")
    public List<TeaFactoryEntity> getAllTeaFactories() {
        return teaFactoryService.getAllTeaFactories();
    }

    @PostMapping("/save")
    public TeaFactoryEntity addTeaFactory(@RequestBody TeaFactoryEntity teaFactoryEntity) {
        return teaFactoryService.addTeaFactory(teaFactoryEntity);
    }
}
