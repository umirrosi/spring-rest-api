package com.umirrosi.springrestapi.repository;

import com.umirrosi.springrestapi.entity.PurchaseOrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderDetailRepo extends JpaRepository<PurchaseOrderDetailEntity, Integer> {
}
