package com.nc.sb.api.v1.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.nc.sb.api.v1.model.UserDTO;
import com.nc.sb.models.user.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDTO userToUserDTO(User user);

}
