package com.umirrosi.springrestapi.service;

import com.umirrosi.springrestapi.model.PurchaseOrderModel;

import java.util.List;
import java.util.Optional;

public interface PurchaseOrderService {
    List<PurchaseOrderModel> getAll();
    Optional<PurchaseOrderModel> getById(Integer id);
    Optional<PurchaseOrderModel> save(PurchaseOrderModel model);
    Optional<PurchaseOrderModel> update(Integer id, PurchaseOrderModel model);
    Optional<PurchaseOrderModel> delete(Integer id);
}
