package com.umirrosi.springrestapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MahasiswaModel {
    private String id;
    private String name;
    private String jk;
    private String alamat;
}
