package com.jam.libro.jamregistryservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JamRegistryServicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(JamRegistryServicioApplication.class, args);
    }

}
