/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springboot.starter.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Jun Hwong
 */
@Controller
public class Home {
    @RequestMapping("/")
    @ResponseBody
    String index() {
        return "Hello Spring Boot!";
    }
    
    @RequestMapping("/login")
    @ResponseBody
    public String login() {
        
        String html="<form action=\"/login\" method=\"post\">\n" +
"            <div><label> 用户名 : <input type=\"text\" name=\"username\"/> </label></div>\n" +
"            <div><label> 密  码 : <input type=\"password\" name=\"password\"/> </label></div>\n" +
"            <div><input type=\"submit\" value=\"登录\"/></div>\n" +
"        </form>";
        
        return html;
    }
    
}
