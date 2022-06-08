package com.example.hellocomponentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GirlFriend {

    public Outfit outfit;

    public void setOutfit(Outfit outfit){
        this.outfit = outfit;
    }
    public Outfit getOutfit(){
        return this.outfit;
    }

    @Autowired
    public GirlFriend(@Qualifier("dress")Outfit outfit){
        this.outfit = outfit;
    }
    public GirlFriend(){

    }

}
