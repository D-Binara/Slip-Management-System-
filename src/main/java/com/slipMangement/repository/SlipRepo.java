package com.slipMangement.repository;

import com.slipMangement.entity.Slip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlipRepo extends JpaRepository<Slip, Integer>{

}
