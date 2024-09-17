package com.nc.sb.models.user;

import com.nc.sb.constants.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

    public User(){

    }
        
    public User(String username, String password, String email, Role customer) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = customer;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;
    private String email;
    private Role role;
}
