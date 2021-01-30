package com.ananke.teafac.teafac.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "teafactory")
public class TeaFactoryEntity {
    @Id
    private String id;
    private String name;
    private String address;
    private String contact;
    private boolean status;
    private Date createdDate;

    public TeaFactoryEntity() {
    }

    public TeaFactoryEntity(String id, String name, String address, String contact, boolean status, Date createdDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.status = status;
        this.createdDate = createdDate;
    }

    public TeaFactoryEntity(String name, String address, String contact, boolean status, Date createdDate) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.status = status;
        this.createdDate = createdDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "TeaFactoryEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", status=" + status +
                ", createdDate=" + createdDate +
                '}';
    }
}
