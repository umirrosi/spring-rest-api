package com.umirrosi.springrestapi.service;

import com.umirrosi.springrestapi.entity.ProductEntity;
import com.umirrosi.springrestapi.model.ProductModel;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductModel> getAll();
    Optional<ProductModel> getById(Integer id);
    Optional<ProductModel> save(ProductModel model);
    Optional<ProductModel> update(Integer id, ProductModel model);
    Optional<ProductModel> delete(Integer id);
}
