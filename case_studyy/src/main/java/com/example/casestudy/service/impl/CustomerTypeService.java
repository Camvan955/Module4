package com.example.casestudy.service.impl;

import com.example.casestudy.model.CustomerType;
import com.example.casestudy.repository.customer.ICustomerRepository;
import com.example.casestudy.repository.customer.ICustomerTypeRepository;
import com.example.casestudy.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    ICustomerTypeRepository iCustomerTypeRepository;


    @Override
    public List<CustomerType> findAll() {
        return iCustomerTypeRepository.findAll();
    }
}
