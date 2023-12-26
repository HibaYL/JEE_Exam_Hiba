package com.example.controle.web;

import com.example.controle.dtos.UserDTO;
import com.example.controle.entities.User;
import com.example.controle.repositories.UserRepository;
import com.example.controle.services.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

@Component
public class UserGraphQLController {
    private UserRepository userRepository;
    @Autowired
            private UserManager userManager;
    UserGraphQLController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @QueryMapping
    public UserDTO getUserByEmail(@Argument String email){
        return userManager.getUserByEmail(email);

    }
    @QueryMapping

    public UserDTO getUserByNaissance(String Naissance){
        return userManager.getUserByNaissance(Naissance);
    }

    @MutationMapping
    public UserDTO saveUser(UserDTO userDTO){
        return userManager.saveUser(userDTO);

    }
    @MutationMapping
    public UserDTO deleteUser(@Argument Long id){
        return userManager.deleteUser(id);
    }


}
