package com.nc.sb.models.user;

import com.nc.sb.constants.Role;

import jakarta.persistence.Entity;

@Entity
public class BankStaff extends User {

    public BankStaff() {
        super();
   }
   
    // @Column(nullable = false, unique = true)
    private String employeeId;

    // @Column(nullable = false)
    private boolean canApproveLoans;


    public BankStaff(String username, String password, String email, String employeeId, boolean canApproveLoans) {
        super(username, password, email, Role.BANK_STAFF); // Role is always BANK_STAFF
        this.employeeId = employeeId;
        this.canApproveLoans = canApproveLoans;
    }
}
