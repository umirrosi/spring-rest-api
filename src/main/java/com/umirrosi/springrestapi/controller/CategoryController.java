package com.umirrosi.springrestapi.controller;

import com.umirrosi.springrestapi.model.Category;
import com.umirrosi.springrestapi.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @GetMapping
    public List<Category> get(){
        return Arrays.asList(
                new Category(1, "minuman"),
                new Category(2, "makanan"),
                new Category(3, "lain-lain")
        );
    }
}
