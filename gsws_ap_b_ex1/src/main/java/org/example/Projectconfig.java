package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Projectconfig {

    @Bean
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("koko");
        return p;
    }

    @Bean
    @Primary
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("miki");
        return p;
    }

    @Bean
    Parrot parrot3(){
        var p = new Parrot();
        p.setName("riki");
        return p;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
