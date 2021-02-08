package com.ananke.teafac.teafac.repository.custom;

import org.bson.Document;
import java.util.List;

public interface SensorDataRepositoryCustom {
    public List<Document> byTroughNumIDAndDateRange(long startTimeStamp, long endTimeStamp, int db_trough_id);

    List<Document> arrayGroupByTrough(long startTimeStamp, long endTimeStamp);

    List<Document> getLastSensorRaw(String date);
}
