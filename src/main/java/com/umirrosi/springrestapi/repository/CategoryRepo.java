package com.umirrosi.springrestapi.repository;

import com.umirrosi.springrestapi.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity, Integer> {
}

