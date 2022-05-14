package com.example.sberprojecttest;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ResourceBundle;

@Configuration
public class Config {

    @Bean
    public ResourceBundle resourceBundle() {
        return ResourceBundle.getBundle("ApiMessage");
    }
}
