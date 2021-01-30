package com.ananke.teafac.teafac.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "devicedatas")
public class SensorDataEntity {
    @Id
    private String id;
    private String node_id;
    private String batch_id;
    private float top_humidity;
    private float bottom_humidity;
    private float top_temperature;
    private float bottom_temperature;
    private float top_bulbdiff;
    private float bottom_bulbdiff;
    private long timestamp;
    private String datetime;
    private String date;
    private String time;
    private int trough_id;
    @DBRef
    private SensorEntity sensorEntity;

    public SensorDataEntity() {
    }

    public SensorDataEntity(String id, String node_id, String batch_id, float top_humidity, float bottom_humidity, float top_temperature, float bottom_temperature, float top_bulbdiff, float bottom_bulbdiff, long timestamp, String datetime, String date, String time, int trough_id, SensorEntity sensorEntity) {
        this.id = id;
        this.node_id = node_id;
        this.batch_id = batch_id;
        this.top_humidity = top_humidity;
        this.bottom_humidity = bottom_humidity;
        this.top_temperature = top_temperature;
        this.bottom_temperature = bottom_temperature;
        this.top_bulbdiff = top_bulbdiff;
        this.bottom_bulbdiff = bottom_bulbdiff;
        this.timestamp = timestamp;
        this.datetime = datetime;
        this.date = date;
        this.time = time;
        this.trough_id = trough_id;
        this.sensorEntity = sensorEntity;
    }

    public SensorDataEntity(String node_id, String batch_id, float top_humidity, float bottom_humidity, float top_temperature, float bottom_temperature, float top_bulbdiff, float bottom_bulbdiff, long timestamp, String datetime, String date, String time, int trough_id, SensorEntity sensorEntity) {
        this.node_id = node_id;
        this.batch_id = batch_id;
        this.top_humidity = top_humidity;
        this.bottom_humidity = bottom_humidity;
        this.top_temperature = top_temperature;
        this.bottom_temperature = bottom_temperature;
        this.top_bulbdiff = top_bulbdiff;
        this.bottom_bulbdiff = bottom_bulbdiff;
        this.timestamp = timestamp;
        this.datetime = datetime;
        this.date = date;
        this.time = time;
        this.trough_id = trough_id;
        this.sensorEntity = sensorEntity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public float getTop_humidity() {
        return top_humidity;
    }

    public void setTop_humidity(float top_humidity) {
        this.top_humidity = top_humidity;
    }

    public float getBottom_humidity() {
        return bottom_humidity;
    }

    public void setBottom_humidity(float bottom_humidity) {
        this.bottom_humidity = bottom_humidity;
    }

    public float getTop_temperature() {
        return top_temperature;
    }

    public void setTop_temperature(float top_temperature) {
        this.top_temperature = top_temperature;
    }

    public float getBottom_temperature() {
        return bottom_temperature;
    }

    public void setBottom_temperature(float bottom_temperature) {
        this.bottom_temperature = bottom_temperature;
    }

    public float getTop_bulbdiff() {
        return top_bulbdiff;
    }

    public void setTop_bulbdiff(float top_bulbdiff) {
        this.top_bulbdiff = top_bulbdiff;
    }

    public float getBottom_bulbdiff() {
        return bottom_bulbdiff;
    }

    public void setBottom_bulbdiff(float bottom_bulbdiff) {
        this.bottom_bulbdiff = bottom_bulbdiff;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTrough_id() {
        return trough_id;
    }

    public void setTrough_id(int trough_id) {
        this.trough_id = trough_id;
    }

    public SensorEntity getSensorEntity() {
        return sensorEntity;
    }

    public void setSensorEntity(SensorEntity sensorEntity) {
        this.sensorEntity = sensorEntity;
    }

    @Override
    public String toString() {
        return "SensorDataEntity{" +
                "id='" + id + '\'' +
                ", node_id='" + node_id + '\'' +
                ", batch_id='" + batch_id + '\'' +
                ", top_humidity=" + top_humidity +
                ", bottom_humidity=" + bottom_humidity +
                ", top_temperature=" + top_temperature +
                ", bottom_temperature=" + bottom_temperature +
                ", top_bulbdiff=" + top_bulbdiff +
                ", bottom_bulbdiff=" + bottom_bulbdiff +
                ", timestamp=" + timestamp +
                ", datetime='" + datetime + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", trough_id=" + trough_id +
                ", sensorEntity=" + sensorEntity +
                '}';
    }
}
