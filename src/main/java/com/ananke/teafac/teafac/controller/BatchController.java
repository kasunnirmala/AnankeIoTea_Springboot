package com.ananke.teafac.teafac.controller;

import com.ananke.teafac.teafac.entity.BatchEntity;
import com.ananke.teafac.teafac.service.BatchService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/v1/batch")
public class BatchController {
    @Autowired
    BatchService batchService;

    @GetMapping("/getAll")
    public List<BatchEntity> getAllBatches() {
        return batchService.getAllBatches();
    }

    @GetMapping("/getAllRunning/{teaFactoryID}")
    public List<BatchEntity> getAllRunningBatches(@PathVariable String teaFactoryID) {
        return batchService.getAllRunningBatches(teaFactoryID);
    }



    @PostMapping("/save")
    public BatchEntity addBatch(@RequestBody BatchEntity batchEntity) {
        return batchService.addBatch(batchEntity);
    }

    @PostMapping("startBatch")
    public JSONObject startBatch(@RequestBody Map<String,Object> payload) {
        return batchService.startBatch(payload);
    }

    @PostMapping("stopBatch")
    public JSONObject stoptBatch(@RequestBody Map<String,Object> payload) {
        return batchService.stopBatch(payload);
    }

    @DeleteMapping("delete/{batchID}")
    public boolean deleteBatch(@PathVariable("batchID") String batchID) {
        return batchService.deleteBatch(batchID);
    }

//    @PutMapping("update/{batchID}")
//    public boolean updateBatch(
//            @PathVariable("batchID") String batchID,
//            @RequestParam(required = false) long endTimestamp) {
//        return batchService.updateBatch(batchID, endTimestamp);
//    }
}
