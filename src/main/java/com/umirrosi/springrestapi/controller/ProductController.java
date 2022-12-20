package com.umirrosi.springrestapi.controller;

import com.umirrosi.springrestapi.entity.ProductEntity;
import com.umirrosi.springrestapi.model.Product;
import com.umirrosi.springrestapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> get(){
        return Arrays.asList(
          new Product(1, "Indomilk Coklat", 2500.0),
          new Product(2, "Indomilk Strawberry", 3000.0),
          new Product(3, "Untramilk Full Cream", 5000.0)
        );
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody ProductEntity request){
        ProductEntity result = productService.save(request);
        return ResponseEntity.ok().body(result);
    }
}
