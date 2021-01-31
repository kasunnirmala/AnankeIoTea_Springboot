package com.ananke.teafac.teafac.service;

import com.ananke.teafac.teafac.entity.BatchEntity;
import com.ananke.teafac.teafac.entity.TeaFactoryEntity;
import com.ananke.teafac.teafac.entity.TroughEntity;
import com.ananke.teafac.teafac.repository.BatchRepository;
import com.ananke.teafac.teafac.repository.TeaFactoryRepository;
import com.ananke.teafac.teafac.repository.TroughRepository;
import net.minidev.json.JSONObject;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class BatchService {
    @Autowired
    BatchRepository batchRepository;
    @Autowired
    TroughRepository troughRepository;
    @Autowired
    TeaFactoryRepository teaFactoryRepository;

    public List<BatchEntity> getAllBatches() {
        return batchRepository.findAll();
    }


    public BatchEntity addBatch(BatchEntity batchEntity) {
        return batchRepository.save(batchEntity);
    }

    public JSONObject startBatch(Map<String, Object> payload) {
        String troughID = payload.get("troughID").toString();
        String teaFactoryID = payload.get("teaFactoryID").toString();
        String batchID = payload.get("batchID").toString();

        JSONObject json = new JSONObject();
        BatchEntity b = batchRepository.byTroughAndStatus(troughID, true);
        System.out.println(b);
        if (b != null) {
            json.put("status", false);
            json.put("message", "This Trough has current running batch");
        } else {
            TroughEntity troughEntity = troughRepository.findById(troughID).get();
            TeaFactoryEntity teaFactoryEntity = teaFactoryRepository.findById(teaFactoryID).get();
            BatchEntity batchEntity = new BatchEntity(
                    batchID,
                    troughEntity.getDbTroughID(),
                    new Date().getTime(),
                    0,
                    true,
                    teaFactoryEntity,
                    troughEntity);
            try {
                batchRepository.save(batchEntity);
                json.put("status", true);
                json.put("batchID", batchID);
            } catch (Exception e) {
                json.put("status", false);
                json.put("message", e.getMessage());
            }
        }
        return json;
    }

    public boolean deleteBatch(String batchID) {
        if (batchRepository.existsById(batchID)) {
            BatchEntity batchEntity = batchRepository.findById(batchID).get();
            try {
                batchRepository.delete(batchEntity);
                return true;
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
        } else {
            return false;
        }
    }


    public JSONObject stopBatch(Map<String, Object> payload) {
        String batchID = payload.get("batchID").toString();

        JSONObject json = new JSONObject();
        BatchEntity b = batchRepository.byBatchId(batchID);
        System.out.println(b);
        if (b == null) {
            json.put("status", false);
            json.put("message", "No Running Batch To Stop.");
        } else {

            try {
                b.setStatus(false);
                b.setEndTimestamp(new Date().getTime());
                batchRepository.save(b);
                json.put("status", true);
                json.put("batchID", batchID);
            } catch (Exception e) {
                json.put("status", false);
                json.put("message", e.getMessage());
            }
        }
        return json;
    }

    public List<BatchEntity> getAllRunningBatches(String teaFactoryID) {
        return batchRepository.getAllRunning(teaFactoryID);
    }

    public List<BatchEntity> getAllFinishedBatches() {
        return batchRepository.allFinished();
    }
}
