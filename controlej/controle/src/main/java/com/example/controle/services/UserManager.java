package com.example.controle.services;


import com.example.controle.dtos.UserDTO;

public interface UserManager {

        UserDTO getUserByEmail(String email);
        UserDTO getUserByNaissance(String Naissance);
        UserDTO saveUser(UserDTO userDTO);
        UserDTO deleteUser(Long id);
    }

