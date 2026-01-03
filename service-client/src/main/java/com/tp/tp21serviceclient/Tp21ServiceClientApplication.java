package com.tp.tp21serviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Tp21ServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp21ServiceClientApplication.class, args);
    }

}
