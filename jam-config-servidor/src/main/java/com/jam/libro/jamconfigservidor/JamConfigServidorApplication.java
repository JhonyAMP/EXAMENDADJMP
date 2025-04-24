package com.jam.libro.jamconfigservidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class JamConfigServidorApplication {

    public static void main(String[] args) {
        SpringApplication.run(JamConfigServidorApplication.class, args);
    }

}
