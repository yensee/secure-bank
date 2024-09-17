package com.nc.sb.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nc.sb.models.user.BankStaff;

public interface BankStaffRepository extends JpaRepository<BankStaff, Long> {
    BankStaff findByUsername(String username);
}