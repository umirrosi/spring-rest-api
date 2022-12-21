package com.umirrosi.springrestapi.repository;

import com.umirrosi.springrestapi.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepo extends JpaRepository<SupplierEntity, Integer> {
}
