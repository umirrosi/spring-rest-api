package com.umirrosi.springrestapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private  int id;
    private  String name;
    private  Double price;
}
