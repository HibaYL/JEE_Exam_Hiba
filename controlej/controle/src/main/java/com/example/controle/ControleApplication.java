package com.example.controle;

import com.example.controle.entities.User;
import com.example.controle.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }
@Bean
    CommandLineRunner start(UserRepository userRepository){
        return args -> {
            List<User>users=List.of(User.builder().name("hiba").email("hiba@gmail.com").password("123").Naissance("07/11/2001").build(),
                    User.builder().name("asmaa").email("asmaa@gmail.com").password("123").Naissance("07/07/2001").build(),
                    User.builder().name("ahmed").email("ahmed@gmail.com").password("123").Naissance("08/07/2001").build(),
                    User.builder().name("salma").email("salma@gmail.com").password("123").Naissance("10/07/2001").build());
            for (User user: users){
                userRepository.save(user);
            }
        };
}


}
