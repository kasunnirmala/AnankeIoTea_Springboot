package com.ananke.teafac.teafac.service;

import com.ananke.teafac.teafac.entity.TeaFactoryEntity;
import com.ananke.teafac.teafac.entity.TroughEntity;
import com.ananke.teafac.teafac.repository.TroughRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TroughService {

    @Autowired
    TroughRepository troughRepository;

    public TroughEntity addTrough(TroughEntity troughEntity) {
        return troughRepository.save(troughEntity);
    }

    public List<TroughEntity> getAllTroughs() {
        return troughRepository.findAll();
    }
}
