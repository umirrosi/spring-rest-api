package com.umirrosi.springrestapi.repository;


import com.umirrosi.springrestapi.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}