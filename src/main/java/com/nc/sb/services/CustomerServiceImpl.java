package com.nc.sb.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.sb.api.v1.mapper.CustomerMapper;
import com.nc.sb.api.v1.model.CustomerDTO;
import com.nc.sb.repositories.user.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private final CustomerMapper customerMapper;

    @Autowired
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerMapper customerMapper, CustomerRepository customerRepository) {
        this.customerMapper = customerMapper;
        this.customerRepository = customerRepository;
    }
    
    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository
        .findAll()
        .stream()
        .map(customerMapper::customerToCustomerDTO)
        .collect(Collectors.toList());
    }

}
