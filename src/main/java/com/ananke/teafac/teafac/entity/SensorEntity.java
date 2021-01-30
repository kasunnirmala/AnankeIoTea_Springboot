package com.ananke.teafac.teafac.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sensor")
public class SensorEntity {
    @Id
    private String id;
    private String sensorID;
    @DBRef
    private SensorDataEntity lastData;


    public SensorEntity() {

    }

    public SensorEntity(String id, String sensorID, SensorDataEntity lastData) {
        this.id = id;
        this.sensorID = sensorID;
        this.lastData = lastData;
    }

    public SensorEntity(String sensorID, SensorDataEntity lastData) {
        this.sensorID = sensorID;
        this.lastData = lastData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSensorID() {
        return sensorID;
    }

    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }

    public SensorDataEntity getLastData() {
        return lastData;
    }

    public void setLastData(SensorDataEntity lastData) {
        this.lastData = lastData;
    }

    @Override
    public String toString() {
        return "SensorEntity{" +
                "id='" + id + '\'' +
                ", sensorID='" + sensorID + '\'' +
                ", lastData=" + lastData +
                '}';
    }
}
