package com.example.demo.config;

import com.example.demo.compent.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean(name = "person2")
    public Person person(){
        return new Person();
    }
}
