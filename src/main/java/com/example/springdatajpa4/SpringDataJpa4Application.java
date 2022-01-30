package com.example.springdatajpa4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "accountAuditAware")
public class SpringDataJpa4Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpa4Application.class, args);
    }

}
