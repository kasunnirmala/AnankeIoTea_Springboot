package com.ananke.teafac.teafac.service;

import com.ananke.teafac.teafac.entity.SensorDataEntity;
import com.ananke.teafac.teafac.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SensorDataService {
    @Autowired
    SensorDataRepository sensorDataRepository;

    public List<SensorDataEntity> getAllSensorData() {
        Pageable paging = PageRequest.of(0, 10, Sort.by("_id").ascending());
        return sensorDataRepository.findAll(paging).getContent();
    }

    public SensorDataEntity addSensorData(SensorDataEntity sensorDataEntity) {
        return sensorDataRepository.save(sensorDataEntity);
    }
}
