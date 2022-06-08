package com.example.hellocomponentscan;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dress")
@Scope("prototype")
public class Dress implements Outfit{
    @Override
    public void wear(){
        System.out.println("Đang mặc váy");
    }
}
