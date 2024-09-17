package com.nc.sb.services;

import java.util.List;

import com.nc.sb.api.v1.model.UserDTO;

public interface UserService {

    List<UserDTO> getAllUsers();
    UserDTO getUserByUsername(String name);


}
