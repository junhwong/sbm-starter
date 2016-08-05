/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springboot.starter.mybatis.service.impl;

import org.springboot.starter.mybatis.domain.City;
import org.springboot.starter.mybatis.mapper.CityMapper;
import org.springboot.starter.mybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jun Hwong
 */
@Component
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;
    
    @Override
    public City findByState(String state) {
        return cityMapper.findByState(state);
    }
    
}
