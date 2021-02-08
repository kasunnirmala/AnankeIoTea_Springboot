package com.ananke.teafac.teafac.repository.custom.impl;

import com.ananke.teafac.teafac.repository.custom.SensorDataRepositoryCustom;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;

import java.util.List;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

public class SensorDataRepositoryCustomImpl implements SensorDataRepositoryCustom {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Document> byTroughNumIDAndDateRange(long startTimeStamp, long endTimeStamp, int db_trough_id) {
        Aggregation aggregation = newAggregation(match(
                Criteria.where("timestamp").lte(endTimeStamp)
                        .andOperator(Criteria.where("timestamp").gte(startTimeStamp)
                                .andOperator(Criteria.where("trough_id").in(db_trough_id)))),
                group("node_id")
                        .first("trough_id").as("trough_id")
                        .push(Aggregation.ROOT).as("data"),
                sort(Sort.Direction.ASC, "_id")
        );
        return mongoTemplate.aggregate(aggregation, "devicedatas", Document.class).getMappedResults();

    }

    @Override
    public List<Document> arrayGroupByTrough(long startTimeStamp, long endTimeStamp) {
        Aggregation aggregation = newAggregation(match(
                Criteria.where("timestamp").lte(endTimeStamp)
                        .andOperator(Criteria.where("timestamp").gte(startTimeStamp))),
                group("node_id")
                        .first("trough_id").as("trough_id")
                        .push(Aggregation.ROOT).as("data"),
                group("trough_id")
                        .push(Aggregation.ROOT).as("data"),
                sort(Sort.Direction.ASC, "_id")
        );
        return mongoTemplate.aggregate(aggregation, "devicedatas", Document.class).getMappedResults();
    }

    @Override
    public List<Document> getLastSensorRaw(String date) {
        Aggregation aggregation = newAggregation(match(
                Criteria.where("date").is(date)),
                sort(Sort.Direction.ASC, "timestamp"),
                group("node_id")
                        .first("trough_id").as("trough_id")
                        .last(ROOT).as("data")
//                group("trough_id")
//                        .push("data").as("data"),
//                sort(Sort.Direction.ASC, "_id")
        );
        return mongoTemplate.aggregate(aggregation, "devicedatas", Document.class).getMappedResults();
    }
}
