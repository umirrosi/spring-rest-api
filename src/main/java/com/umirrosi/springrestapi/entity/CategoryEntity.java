package com.umirrosi.springrestapi.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @Column(name = "id", length = 36)
    private int categoryId;

    @Column(name = "code", length = 120)
    private  String code;

    @Column(name = "category", length = 120)
    private String category;
}