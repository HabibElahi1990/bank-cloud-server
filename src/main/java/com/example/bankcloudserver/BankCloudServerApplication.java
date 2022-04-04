package com.example.bankcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BankCloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankCloudServerApplication.class, args);
    }

}
