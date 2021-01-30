package com.ananke.teafac.teafac.repository;

import com.ananke.teafac.teafac.entity.SensorDataEntity;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SensorDataRepository extends MongoRepository<SensorDataEntity,String> {
//    @Query("{'trough_id':?0}")
//    public List<SensorDataEntity> getAllSensorDataByTrough(int troughID);


//    @Aggregation(pipeline = {"{\n" +
//            "        '$match': {\n" +
//            "            'node_id': 'ANANKETEANODE009'\n" +
//            "        }\n" +
//            "    }","{\n" +
//            "        '$limit': 5\n" +
//            "    }"})
//    public AggregationResults<SensorDataEntity> testAggregations();
}
