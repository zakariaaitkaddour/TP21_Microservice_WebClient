package com.tp.tp21servicecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
public class Tp21ServiceCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp21ServiceCarApplication.class, args);
    }

}
