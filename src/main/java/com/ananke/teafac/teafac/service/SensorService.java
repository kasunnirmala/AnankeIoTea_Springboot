package com.ananke.teafac.teafac.service;

import com.ananke.teafac.teafac.entity.SensorEntity;
import com.ananke.teafac.teafac.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    @Autowired
    SensorRepository sensorRepository;

    public List<SensorEntity> getAllSensors() {
        return sensorRepository.findAll();
    }

    public SensorEntity addSensor(SensorEntity sensorEntity) {
       return sensorRepository.save(sensorEntity);
    }
}
