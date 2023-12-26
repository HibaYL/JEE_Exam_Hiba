package com.example.controle.repositories;


import com.example.controle.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByNaissance(String Naissance);
}
