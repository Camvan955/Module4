package com.example.casestudy.service;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.service.impl.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGeneralService<Customer> {
    Page<Customer> searchByName(String name, String email, String customerType, Pageable pageable);
}
