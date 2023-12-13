package com.fund.Slip_Manager.service;

import com.fund.Slip_Manager.dto.UserDTO;
import com.fund.Slip_Manager.entity.User;
import com.fund.Slip_Manager.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService implements UserServiceInterface {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    public List<UserDTO>  getAllUsers(){
        List<User>userList=userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());
    }


    public List<UserDTO> findAllUsers() {
        List<User> users = userRepo.findAll();
        return users.stream()
                .map(this::mapToUserDto)
                .collect(Collectors.toList());
    }

    private UserDTO mapToUserDto(User user){
        UserDTO userDto = new UserDTO();
        String[] str = user.getName().split(" ");
        userDto.setEmail(user.getEmail());
        return userDto;
    }

}
