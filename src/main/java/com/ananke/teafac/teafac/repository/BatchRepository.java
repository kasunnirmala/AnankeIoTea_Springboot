package com.ananke.teafac.teafac.repository;

import com.ananke.teafac.teafac.entity.BatchEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatchRepository extends MongoRepository<BatchEntity, String> {
    @Query("{'status':?1,'trough.id':?0}")
    public BatchEntity byTroughAndStatus(String troughID,boolean status);

    @Query("{'batchId':?0}")
    public BatchEntity byBatchId(String batchId);

    @Query("{'status':true,'teaFactory.id':?0}")
    public List<BatchEntity> getAllRunning(String teaFactoryID);

    @Query("{'status':false}")
    public List<BatchEntity> allFinished();


}
