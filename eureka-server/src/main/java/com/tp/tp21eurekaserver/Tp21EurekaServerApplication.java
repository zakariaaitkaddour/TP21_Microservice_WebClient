package com.tp.tp21eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Tp21EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp21EurekaServerApplication.class, args);
    }

}
