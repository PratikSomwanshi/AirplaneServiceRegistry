package com.wanda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AirplaneEurekaServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(AirplaneEurekaServerApplication.class, args);
    }

}
