package com.umirrosi.springrestapi.repository;

import com.umirrosi.springrestapi.entity.PurchaseOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderRepo extends JpaRepository<PurchaseOrderEntity, Integer> {
}
