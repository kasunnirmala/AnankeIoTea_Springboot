package com.ananke.teafac.teafac.entity;

import com.fasterxml.jackson.core.SerializableString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "batch")
public class BatchEntity{

    @Id
    private String id;
    private String batchId;
    private int trough_id;
    private long startTimestamp;
    private long endTimestamp;
    private boolean status;
    @DBRef
    private TeaFactoryEntity teaFactory;
    @DBRef
    private TroughEntity trough;


    public BatchEntity() {
    }

    public BatchEntity(String id, String batchId, int trough_id, long startTimestamp, long endTimestamp, boolean status, TeaFactoryEntity teaFactory, TroughEntity trough) {
        this.id = id;
        this.batchId = batchId;
        this.trough_id = trough_id;
        this.startTimestamp = startTimestamp;
        this.endTimestamp = endTimestamp;
        this.status = status;
        this.teaFactory = teaFactory;
        this.trough = trough;
    }

    public BatchEntity(String batchId, int trough_id, long startTimestamp, long endTimestamp, boolean status, TeaFactoryEntity teaFactory, TroughEntity trough) {
        this.batchId = batchId;
        this.trough_id = trough_id;
        this.startTimestamp = startTimestamp;
        this.endTimestamp = endTimestamp;
        this.status = status;
        this.teaFactory = teaFactory;
        this.trough = trough;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public int getTrough_id() {
        return trough_id;
    }

    public void setTrough_id(int trough_id) {
        this.trough_id = trough_id;
    }

    public long getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public long getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public TeaFactoryEntity getTeaFactory() {
        return teaFactory;
    }

    public void setTeaFactory(TeaFactoryEntity teaFactory) {
        this.teaFactory = teaFactory;
    }

    public void setTrough(TroughEntity trough) {
        this.trough = trough;
    }

    public TroughEntity getTrough() {
        return trough;
    }

    @Override
    public String toString() {
        return "BatchEntity{" +
                "id='" + id + '\'' +
                ", batchId='" + batchId + '\'' +
                ", trough_id=" + trough_id +
                ", startTimestamp=" + startTimestamp +
                ", endTimestamp=" + endTimestamp +
                ", status=" + status +
                ", teaFactory=" + teaFactory +
                ", troughEntity=" + trough +
                '}';
    }

}

