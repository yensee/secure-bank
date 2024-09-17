package com.nc.sb.services;

import java.util.List;

import com.nc.sb.api.v1.model.CustomerDTO;

public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
}
