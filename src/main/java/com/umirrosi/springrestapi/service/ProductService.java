package com.umirrosi.springrestapi.service;

import com.umirrosi.springrestapi.entity.ProductEntity;
import com.umirrosi.springrestapi.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAll();
    public ProductEntity save(ProductEntity data);
}
