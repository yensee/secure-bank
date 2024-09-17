package com.nc.sb.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.sb.api.v1.mapper.UserMapper;
import com.nc.sb.api.v1.model.UserDTO;
import com.nc.sb.repositories.user.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserMapper userMapper;

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository
                .findAll()
                .stream()
                .map(userMapper::userToUserDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserByUsername(String name) {
        return userMapper.userToUserDTO(userRepository.findByUsername(name));
    }

}
