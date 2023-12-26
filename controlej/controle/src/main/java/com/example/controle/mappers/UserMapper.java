package com.example.controle.mappers;

import com.example.controle.entities.User;
import com.example.controle.dtos.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public User fromUserDTO(UserDTO userDTO){
        return this.modelMapper.map(userDTO,User.class);
    }
    public UserDTO fromUser(User user){
        return this.modelMapper.map(user,UserDTO.class);
    }
}
