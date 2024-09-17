package com.nc.sb.controllers.v1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nc.sb.api.v1.model.UserDTO;
import com.nc.sb.api.v1.model.UserListDTO;
import com.nc.sb.services.UserService;

@Controller
@RequestMapping(UserController.BASE_URL)
public class UserController {

    public static final String BASE_URL="/api/v1/users";

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<UserListDTO> getAllUsers(){
        return new ResponseEntity<UserListDTO>(new UserListDTO(userService.getAllUsers()),HttpStatus.OK);
    }

    @GetMapping("{name}")
    public ResponseEntity<UserDTO> getCategoryByName( @PathVariable String name){
        return new ResponseEntity<UserDTO>(
                userService.getUserByUsername(name), HttpStatus.OK
        );
    }

    /**
     * This method is not to be used
     * @param name
     * @return
     */
    @GetMapping("{name}/abc")
    public ResponseEntity<UserDTO> getCategoryByNamev1( @PathVariable String name){
        return new ResponseEntity<UserDTO>(
                userService.getUserByUsername(name), HttpStatus.OK
        );
    }
}
