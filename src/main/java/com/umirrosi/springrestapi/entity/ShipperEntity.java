package com.umirrosi.springrestapi.entity;

import com.umirrosi.springrestapi.model.CategoryModel;
import com.umirrosi.springrestapi.model.ShipperModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//employee,shipper,supplier
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "shipper_tab")
public class ShipperEntity {
    @Id
    @TableGenerator(name = "shipper_id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="shipper_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "shipper_id_generator")
    private Long id;

    @Column(name = "shipper_name", length = 100, nullable = false)
    private String shipperName;

    @Column(name = "phone", length = 20)
    private String phone;

    @OneToMany(mappedBy = "shipper")
    private Set<PurchaseOrderEntity> purchaseOrder = new HashSet<>();

    public ShipperEntity(ShipperModel model) {
        BeanUtils.copyProperties(model, this);
    }
}

