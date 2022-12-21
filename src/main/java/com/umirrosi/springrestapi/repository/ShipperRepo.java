package com.umirrosi.springrestapi.repository;

import com.umirrosi.springrestapi.entity.ShipperEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipperRepo extends JpaRepository<ShipperEntity, Long> {
}
