package com.ananke.teafac.teafac.repository;

import com.ananke.teafac.teafac.entity.SensorEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends MongoRepository<SensorEntity,String> {
}
