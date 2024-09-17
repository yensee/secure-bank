package com.nc.sb.api.v1.model;

import com.nc.sb.constants.Role;

import lombok.Data;

@Data
public class UserDTO {

    private long id;
    private String username;
    private String email;
    private Role role;
    
}
