package com.ananke.teafac.teafac.repository;

import com.ananke.teafac.teafac.entity.SensorDataEntity;
import com.ananke.teafac.teafac.repository.custom.SensorDataRepositoryCustom;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorDataRepository extends MongoRepository<SensorDataEntity, String>, SensorDataRepositoryCustom {
}