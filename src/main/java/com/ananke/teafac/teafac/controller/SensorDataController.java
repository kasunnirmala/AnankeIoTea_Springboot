package com.ananke.teafac.teafac.controller;

import com.ananke.teafac.teafac.entity.SensorDataEntity;
import com.ananke.teafac.teafac.service.SensorDataService;
import com.mongodb.client.AggregateIterable;
import org.bson.Document;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/sensor-data")
@CrossOrigin(origins = "*")
public class SensorDataController {
    @Autowired
    SensorDataService sensorDataService;

    @GetMapping("/getAll")
    public List<SensorDataEntity> getAllSensorData() {
        return sensorDataService.getAllSensorData();
    }

    @GetMapping("/getWitheringWithTroughID/{db_trough_id}")
    public List<Document> getWitheringWithTroughID(@PathVariable int db_trough_id) {
        DateTimeZone timeZone = DateTimeZone.forID("Asia/Colombo");
        long endTimeStamp = new DateTime(timeZone).getMillis();
        long startTimeStamp = new DateTime(timeZone).minusDays(1).getMillis();
        return sensorDataService.byTroughNumIDAndDateRange(startTimeStamp, endTimeStamp, db_trough_id);
    }

    @GetMapping("/getWitheringAllArrayGroupByTrough")
    public List<Document> getWitheringAllArrayGroupByTrough() {
        DateTimeZone timeZone = DateTimeZone.forID("Asia/Colombo");
        long endTimeStamp = new DateTime(timeZone).getMillis();
        long startTimeStamp = new DateTime(timeZone).minusHours(1).getMillis();
        return sensorDataService.getWitheringAllArrayGroupByTrough(startTimeStamp, endTimeStamp);
    }


    @PostMapping("/save")
    public SensorDataEntity addSensorData(@RequestBody SensorDataEntity sensorDataEntity) {
        return sensorDataService.addSensorData(sensorDataEntity);
    }

}
