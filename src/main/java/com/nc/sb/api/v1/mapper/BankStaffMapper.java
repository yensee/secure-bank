package com.nc.sb.api.v1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.nc.sb.api.v1.model.BankStaffDTO;
import com.nc.sb.models.user.BankStaff;

@Mapper(componentModel = "spring")
public interface BankStaffMapper {
    
    BankStaffMapper INSTANCE = Mappers.getMapper(BankStaffMapper.class);
    BankStaffDTO bankStaffToBankStaffDTO(BankStaff bankStaff);

}
