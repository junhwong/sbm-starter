/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springboot.springboot.starter.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author Jun Hwong
 */
@ComponentScan(basePackages = {"org.springboot.springboot.starter.web.controller"})
@SpringBootApplication
public class Startup implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        
    }
    
    
    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }
}
