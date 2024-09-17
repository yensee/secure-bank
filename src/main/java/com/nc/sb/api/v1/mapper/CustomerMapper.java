package com.nc.sb.api.v1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.nc.sb.api.v1.model.CustomerDTO;
import com.nc.sb.models.user.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper{
    
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerDTO customerToCustomerDTO(Customer customer);

}

