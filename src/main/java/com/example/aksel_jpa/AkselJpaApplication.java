package com.example.aksel_jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AkselJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AkselJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner run(PersonServiceImpl personService){
        return args -> {
            personService.savePerson(new Person(
                    null,
                    "Toros",
                    "Kutlu",
                    "1985-12-15",
                    "Ghettostreet 99"
            ));
        };
    }
}