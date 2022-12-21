package com.umirrosi.springrestapi.service;

import com.umirrosi.springrestapi.model.ShipperModel;

import java.util.List;
import java.util.Optional;

public interface ShipperService {
    List<ShipperModel> getAll();
    Optional<ShipperModel> getById(Integer id);
    Optional<ShipperModel> save(ShipperModel model);
    Optional<ShipperModel> update(Integer id, ShipperModel model);
    Optional<ShipperModel> delete(Integer id);
}
