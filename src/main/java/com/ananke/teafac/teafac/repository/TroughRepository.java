package com.ananke.teafac.teafac.repository;

import com.ananke.teafac.teafac.entity.TroughEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TroughRepository extends MongoRepository<TroughEntity,String> {
}
