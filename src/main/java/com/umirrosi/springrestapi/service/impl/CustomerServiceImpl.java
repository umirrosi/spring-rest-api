package com.umirrosi.springrestapi.service.impl;

import com.umirrosi.springrestapi.entity.CustomerEntity;
import com.umirrosi.springrestapi.model.CustomerModel;
import com.umirrosi.springrestapi.repository.CustomerRepo;
import com.umirrosi.springrestapi.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepo repo;

    @Autowired
    public CustomerServiceImpl(com.umirrosi.springrestapi.repository.CustomerRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<CustomerModel> getAll() {
        return this.repo.findAll().stream().map(CustomerModel::new)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CustomerModel> getById(Integer id) {
        if(id == 0) {
            return Optional.empty();
        }
        Optional<CustomerEntity> result = this.repo.findById(id);
        return result.map(CustomerModel::new);
    }

    @Override
    public Optional<CustomerModel> save(CustomerModel model) {
        if( model == null) {
            return Optional.empty();
        }
        CustomerEntity entity = new CustomerEntity(model);
        try {
            this.repo.save(entity);
            return Optional.of(new CustomerModel(entity));
        }catch (Exception e){
            log.error("Category save is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<CustomerModel> update(Integer id, CustomerModel model) {

        if(id == 0) {
            return Optional.empty();
        }

        CustomerEntity result = this.repo.findById(id).orElse(null);
        if(result == null){
            return Optional.empty();
        }

        BeanUtils.copyProperties(model, result);
        try {
            this.repo.save(result);
            return Optional.of(new CustomerModel(result));
        }catch (Exception e){
            log.error("Category update is failed, error: {}", e.getMessage());
            return Optional.empty();
        }

    }

    @Override
    public Optional<CustomerModel> delete(Integer id) {

        if(id == 0) {
            return Optional.empty();
        }

        CustomerEntity result = this.repo.findById(id).orElse(null);
        if(result == null){
            return Optional.empty();
        }

        try {
            this.repo.delete(result);
            return Optional.of(new CustomerModel(result));
        }catch (Exception e){
            log.error("Product delete is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }
}