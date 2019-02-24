package com.learn.openshift;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class OpenshiftApplication {
//    @Value("${security.user.name}") String username;
    @GetMapping("/")
    public String  test(){

        System.out.println("---------------CALL BY ----TREAD--------------" +Thread.currentThread().getId());
        System.out.println("---------------CALL BY ----HASH--------------" +this.hashCode() );

        return "hello : " + this.hashCode() + ": " + System.getenv("HOSTNAME")  ;
    }

//    @Bean
//    public String username() {
//        System.out.println("---------------username 1--------------" );
//        System.out.println("---------------username--------------" +username);
//        return username;
//
//    }

    public static void main(String[] args)
    {
        System.out.println("---------------CREATE BY ----HASH--------------" );


        SpringApplication.run(OpenshiftApplication.class, args);
    }

}
