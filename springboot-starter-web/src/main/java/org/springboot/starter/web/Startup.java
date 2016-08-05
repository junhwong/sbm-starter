/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springboot.starter.web;

import org.springboot.starter.mybatis.service.CityService;
import org.springboot.starter.mybatis.service.impl.CityServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author Jun Hwong
 */
@ComponentScan(basePackages = {"org.springboot.starter"})
@SpringBootApplication
public class Startup implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        
    }
    
//    @Bean
//    public CityService cityService(){
//        return new CityServiceImpl();
//    }
    
    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }
}
