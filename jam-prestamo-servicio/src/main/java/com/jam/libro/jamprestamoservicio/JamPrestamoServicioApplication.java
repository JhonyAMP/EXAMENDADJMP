package com.jam.libro.jamprestamoservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
public class JamPrestamoServicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(JamPrestamoServicioApplication.class, args);
    }

}
