package com.example.controle.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "users")
@AllArgsConstructor @NoArgsConstructor @Data @Builder @ToString
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_User;
    private String name;
    private String email;
    private String Naissance;
    private String password;
}


