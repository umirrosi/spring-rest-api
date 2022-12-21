package com.umirrosi.springrestapi.service.impl;

import com.umirrosi.springrestapi.entity.SupplierEntity;
import com.umirrosi.springrestapi.model.SupplierModel;
import com.umirrosi.springrestapi.repository.SupplierRepo;
import com.umirrosi.springrestapi.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SupplierServiceImpl implements SupplierService {

    private SupplierRepo repo;

    @Autowired
    public SupplierServiceImpl(SupplierRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<SupplierModel> getAll() {
        return this.repo.findAll().stream().map(SupplierModel::new)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<SupplierModel> getById(Integer id) {
        if(id == 0) {
            return Optional.empty();
        }
        Optional<SupplierEntity> result = this.repo.findById(id);
        return result.map(SupplierModel::new);
    }

    @Override
    public Optional<SupplierModel> save(SupplierModel model) {
        return Optional.empty();
    }

    @Override
    public Optional<SupplierModel> update(Integer id, SupplierModel model) {
        return Optional.empty();
    }

    @Override
    public Optional<SupplierModel> delete(Integer id) {
        return Optional.empty();
    }
}
