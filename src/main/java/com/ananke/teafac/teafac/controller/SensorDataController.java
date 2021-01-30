package com.ananke.teafac.teafac.controller;

import com.ananke.teafac.teafac.entity.SensorDataEntity;
import com.ananke.teafac.teafac.entity.TeaFactoryEntity;
import com.ananke.teafac.teafac.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/sensor-data")
public class SensorDataController {
    @Autowired
    SensorDataService sensorDataService;

    @GetMapping("/getAll")
    public List<SensorDataEntity> getAllSensorData() {
        return sensorDataService.getAllSensorData();
    }


    @PostMapping("/save")
    public SensorDataEntity addSensorData(@RequestBody SensorDataEntity sensorDataEntity) {
        return sensorDataService.addSensorData(sensorDataEntity);
    }

}
