package com.umirrosi.springrestapi.service.impl;

import com.umirrosi.springrestapi.model.CustomerModel;
import com.umirrosi.springrestapi.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<CustomerModel> getAll() {
        return null;
    }

    @Override
    public Optional<CustomerModel> getById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomerModel> save(CustomerModel model) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomerModel> update(Integer id, CustomerModel model) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomerModel> delete(Integer id) {
        return Optional.empty();
    }
}
