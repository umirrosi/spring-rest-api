package com.umirrosi.springrestapi.controller;

import com.umirrosi.springrestapi.model.CustomerModel;
import com.umirrosi.springrestapi.model.ResponseModel;
import com.umirrosi.springrestapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private CustomerService service;

    @Autowired
    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Object> get(){
        List<CustomerModel> result = service.getAll();
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") Integer id){
        Optional<CustomerModel> result = service.getById(id);
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

    @PostMapping()
    public ResponseEntity<Object> saveCategory(@RequestBody CustomerModel request){
        Optional<CustomerModel> result = service.save(request);
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> updateCategory(@PathVariable("id") Integer id, @RequestBody CustomerModel request){
        Optional<CustomerModel> result = service.update(id, request);
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer id){
        Optional<CustomerModel> result = service.delete(id);
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }
}

