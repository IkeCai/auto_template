package com.mycompany.autotemplate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    
    @Bean
    public CommandLineRunner run() {
        return args -> {
            HelloWorld helloWorld = new HelloWorld();
            helloWorld.printHelloWorld();
        };
    }
}
