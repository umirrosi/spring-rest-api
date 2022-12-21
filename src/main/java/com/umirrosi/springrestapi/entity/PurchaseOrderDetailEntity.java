package com.umirrosi.springrestapi.entity;
import com.umirrosi.springrestapi.model.ProductModel;
import com.umirrosi.springrestapi.model.PurchaseOrderDetailModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "po_detail_tab")

public class PurchaseOrderDetailEntity {
    @Id
    @TableGenerator(name = "po_detail_id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="po_detail_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "po_detail_id_generator")
    private Integer id;

    @Column(name = "po_id")
    private Integer poId;

    @Column(name = "product_id", nullable = false)
    private Long productId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity product;

    @Column(name = "quantity", nullable = false)
    private Double quantity;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "sub_amount", nullable = false)
    private Double subAmount;

    public PurchaseOrderDetailEntity(PurchaseOrderDetailModel model) {
        BeanUtils.copyProperties(model, this);
    }
}


