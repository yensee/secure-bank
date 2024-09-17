package com.nc.sb.models.user;

import com.nc.sb.constants.Role;

import jakarta.persistence.Entity;

@Entity
public class Customer extends User {

    public Customer(){
        super();
    }

    //@Column(nullable = false, unique = true)
    private String accountNumber;

    //@Column(nullable = false)
    private Double balance;

    //@Column(nullable = false)
    private String accountStatus; 

    public Customer(String username, String password, String email, String accountNumber, Double balance, String accountStatus) {
        super(username, password, email, Role.SYSTEM_ADMIN); // Role is always CUSTOMER
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountStatus = accountStatus;
    }
}
