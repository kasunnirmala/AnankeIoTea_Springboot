package com.ananke.teafac.teafac.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "trough")
public class TroughEntity {
    @Id
    private String id;
    private String troughID;
    private String troughName;
    private int dbTroughID;
    private boolean status;
    @DBRef
    private List<SensorEntity> sensors;
    @DBRef
    private TeaFactoryEntity teaFactory;

    public TroughEntity() {
    }

    public TroughEntity(String id, String troughID, String troughName, int dbTroughID, boolean status, List<SensorEntity> sensors, TeaFactoryEntity teaFactory) {
        this.id = id;
        this.troughID = troughID;
        this.troughName = troughName;
        this.dbTroughID = dbTroughID;
        this.status = status;
        this.sensors = sensors;
        this.teaFactory = teaFactory;
    }

    public TroughEntity(String troughID, String troughName, int dbTroughID, boolean status, List<SensorEntity> sensors, TeaFactoryEntity teaFactory) {
        this.troughID = troughID;
        this.troughName = troughName;
        this.dbTroughID = dbTroughID;
        this.status = status;
        this.sensors = sensors;
        this.teaFactory = teaFactory;
    }


    public String getTroughName() {
        return troughName;
    }

    public void setTroughName(String troughName) {
        this.troughName = troughName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTroughID() {
        return troughID;
    }

    public void setTroughID(String troughID) {
        this.troughID = troughID;
    }

    public int getDbTroughID() {
        return dbTroughID;
    }

    public void setDbTroughID(int dbTroughID) {
        this.dbTroughID = dbTroughID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<SensorEntity> getSensors() {
        return sensors;
    }

    public void setSensors(List<SensorEntity> sensors) {
        this.sensors = sensors;
    }

    public TeaFactoryEntity getTeaFactory() {
        return teaFactory;
    }

    public void setTeaFactory(TeaFactoryEntity teaFactory) {
        this.teaFactory = teaFactory;
    }

    @Override
    public String toString() {
        return "TroughEntity{" +
                "id='" + id + '\'' +
                ", troughID='" + troughID + '\'' +
                ", troughName='" + troughName + '\'' +
                ", dbTroughID=" + dbTroughID +
                ", status=" + status +
                ", sensors=" + sensors +
                ", teaFactory=" + teaFactory +
                '}';
    }
}
