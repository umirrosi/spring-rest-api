package com.umirrosi.springrestapi.entity;


import com.umirrosi.springrestapi.model.ProductModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_tab")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "product_code", length = 20, nullable = false)
    private String code;

    @Column(name = "product_name", length = 100, nullable = false)
    private String name;

    @Column(name = "product_price")
    private Double price;

    @Column(name = "category_id", nullable = false)
    private int categoryId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private CategoryEntity category;

    public ProductEntity(ProductModel model) {
        BeanUtils.copyProperties(model, this);
        /*
        this.code = model.getCode();
        this.name = model.getName();
        this.price = model.getPrice();
        this.categoryId = model.getCategoryId();
         */
    }
}
