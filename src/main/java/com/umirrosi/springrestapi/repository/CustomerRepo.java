package com.umirrosi.springrestapi.repository;

import com.umirrosi.springrestapi.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer> {
}
