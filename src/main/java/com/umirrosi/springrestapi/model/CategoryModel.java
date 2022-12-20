package com.umirrosi.springrestapi.model;

import com.umirrosi.springrestapi.entity.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryModel {
    private int id;
    private String code;
    private String name;

    public CategoryModel(CategoryEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}

