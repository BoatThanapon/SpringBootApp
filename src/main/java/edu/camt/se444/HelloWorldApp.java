package edu.camt.se444;

import edu.camt.se444.AdventureGame.controllers.CharacterController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class HelloWorldApp {

    @RequestMapping("/")
    String hello() {
        return "Hello World! SE444 Lab 05";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorldApp.class, args);
        //SpringApplication.run(CharacterController.class, args);
    }
}
