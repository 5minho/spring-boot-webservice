package me.minomi.springbootservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServiceApplication.class, args);
    }

}
