package com.slipMangement.service;

import com.slipMangement.entity.Slip;
import com.slipMangement.repository.SlipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SlipServiceImpl implements SlipService {

    @Autowired
    private SlipRepo slipRepo;

    @Override
    public Slip saveSlip(Slip slip) {

        Slip newSlip =slipRepo.save(slip);

        return newSlip;
    }

}
