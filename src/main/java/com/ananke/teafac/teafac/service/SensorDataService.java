package com.ananke.teafac.teafac.service;

import com.ananke.teafac.teafac.entity.SensorDataEntity;
import com.ananke.teafac.teafac.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

import org.bson.Document;

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

    public List<Document> byTroughNumIDAndDateRange(long startTimeStamp, long endTimeStamp, int db_trough_id) {
        return sensorDataRepository.byTroughNumIDAndDateRange(startTimeStamp, endTimeStamp, db_trough_id);
    }

    public List<Document> getWitheringAllArrayGroupByTrough(long startTimeStamp, long endTimeStamp) {
        return sensorDataRepository.arrayGroupByTrough(startTimeStamp, endTimeStamp);
    }

    public List<Document> getLastSensorRaw(String date) {
        return sensorDataRepository.getLastSensorRaw(date);
    }
}
