package com.ananke.teafac.teafac.controller;

import com.ananke.teafac.teafac.entity.TeaFactoryEntity;
import com.ananke.teafac.teafac.entity.TroughEntity;
import com.ananke.teafac.teafac.service.TroughService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/trough")
@CrossOrigin(origins = "*")
public class TroughController {
    @Autowired
    TroughService troughService;

    @GetMapping("/getAll")
    public List<TroughEntity> getAllTroughs() {
        return troughService.getAllTroughs();
    }

    @PostMapping("/save")
    public TroughEntity addTrough(@RequestBody TroughEntity troughEntity) {
        return troughService.addTrough(troughEntity);
    }


}
