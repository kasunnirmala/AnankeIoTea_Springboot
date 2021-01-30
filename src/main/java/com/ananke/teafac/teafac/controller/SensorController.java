package com.ananke.teafac.teafac.controller;

import com.ananke.teafac.teafac.entity.SensorEntity;
import com.ananke.teafac.teafac.entity.TroughEntity;
import com.ananke.teafac.teafac.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/sensor")
public class SensorController {
    @Autowired
    SensorService sensorService;
    @GetMapping("/getAll")
    public List<SensorEntity> getAllSensors() {
        return sensorService.getAllSensors();
    }

    @PostMapping("/save")
    public SensorEntity addSensor(@RequestBody SensorEntity sensorEntity) {
        return sensorService.addSensor(sensorEntity);
    }
}
