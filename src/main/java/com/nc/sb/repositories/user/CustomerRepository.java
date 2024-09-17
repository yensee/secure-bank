package com.nc.sb.repositories.user;

import com.nc.sb.models.user.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByUsername(String username);
}
