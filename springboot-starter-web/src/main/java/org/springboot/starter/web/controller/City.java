/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springboot.starter.web.controller;

import org.springboot.starter.mybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Jun Hwong
 */
@Controller
@RequestMapping("/test")
public class City {
    
    @Autowired //(required=false)
    CityService cityService;
    
    @RequestMapping("/index")
    @ResponseBody
    String index() {
        return "found state:" + cityService.findByState("CA");
    }
}
