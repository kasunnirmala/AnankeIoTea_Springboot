package com.ananke.teafac.teafac.repository;

import com.ananke.teafac.teafac.entity.TeaFactoryEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeaFactoryRepository extends MongoRepository<TeaFactoryEntity, String> {
}
