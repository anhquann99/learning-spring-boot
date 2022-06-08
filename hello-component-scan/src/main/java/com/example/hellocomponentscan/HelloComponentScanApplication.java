package com.example.hellocomponentscan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloComponentScanApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(HelloComponentScanApplication.class, args);

        GirlFriend girlFriend = context.getBean(GirlFriend.class);
        System.out.println("GirlFriend: " + girlFriend);
        System.out.println("Out of girlfriend: " + girlFriend.outfit);
        girlFriend.outfit.wear();

//        Dress dress1 = context.getBean(Dress.class);
//        System.out.println(dress1);
//        Dress dress2 = context.getBean(Dress.class);
//        System.out.println(dress2);

    }

}
