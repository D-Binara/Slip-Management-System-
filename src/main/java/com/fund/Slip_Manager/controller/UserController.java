package com.fund.Slip_Manager.controller;

import com.fund.Slip_Manager.dto.UserDTO;
import com.fund.Slip_Manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDTO> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public String updateUser() {
        return "Test 3";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser() {
        return "Test 4";
    }

}