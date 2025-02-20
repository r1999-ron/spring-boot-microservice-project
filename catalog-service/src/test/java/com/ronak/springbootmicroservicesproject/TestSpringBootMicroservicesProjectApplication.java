package com.ronak.springbootmicroservicesproject;

import org.springframework.boot.SpringApplication;

public class TestSpringBootMicroservicesProjectApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringBootMicroservicesProjectApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
