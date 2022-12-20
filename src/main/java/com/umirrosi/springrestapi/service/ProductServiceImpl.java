package com.umirrosi.springrestapi.service;

import com.umirrosi.springrestapi.entity.ProductEntity;
import com.umirrosi.springrestapi.model.Product;
import com.umirrosi.springrestapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public ProductEntity save(ProductEntity productEntity) {
        if(productEntity == null) {
            return new ProductEntity();
        }
        ProductEntity result= new ProductEntity();
        try{
            // proses simpan data => table siswa
            this.productRepository.save(result);
            return new ProductEntity();
        }catch (Exception e){
            return new ProductEntity();
        }
    }


}
