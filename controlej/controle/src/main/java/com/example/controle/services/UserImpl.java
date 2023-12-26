package com.example.controle.services;


import com.example.controle.dtos.UserDTO;
import com.example.controle.mappers.UserMapper;
import com.example.controle.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserImpl implements UserManager{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;


    @Override
    public UserDTO getUserByEmail(String email) {
        return userMapper.fromUser(userRepository.findByEmail(email));
    }

    @Override
    public UserDTO getUserByNaissance(String Naissance) {
        return userMapper.fromUser(userRepository.findByNaissance(Naissance));
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        try {
            return userMapper.fromUser(userRepository.save(userMapper.fromUserDTO(userDTO)));
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }


    @Override
    public UserDTO deleteUser(Long id) {

        userRepository.deleteById(id);
        return null;
    }


}
