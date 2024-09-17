package com.nc.sb.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.sb.api.v1.mapper.BankStaffMapper;
import com.nc.sb.api.v1.model.BankStaffDTO;
import com.nc.sb.repositories.user.BankStaffRepository;

@Service
public class BankStaffServiceImpl implements BankStaffService {

    @Autowired
    private final BankStaffMapper bankStaffMapper;

    @Autowired
    private final BankStaffRepository bankStaffRepository;

    public BankStaffServiceImpl(BankStaffMapper bankStaffMapper, BankStaffRepository bankStaffRepository) {
        this.bankStaffMapper = bankStaffMapper;
        this.bankStaffRepository = bankStaffRepository;
    }

    @Override
    public List<BankStaffDTO> getAllBankingStaff() {
        return bankStaffRepository
        .findAll()
        .stream()
        .map(bankStaffMapper::bankStaffToBankStaffDTO)
        .collect(Collectors.toList());
    }
    
}
