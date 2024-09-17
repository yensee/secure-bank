package com.nc.sb.services;

import java.util.List;

import com.nc.sb.api.v1.model.BankStaffDTO;

public interface BankStaffService {
        List<BankStaffDTO> getAllBankingStaff();
}
