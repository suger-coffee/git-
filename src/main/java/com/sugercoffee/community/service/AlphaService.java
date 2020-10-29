package com.sugercoffee.community.service;

import com.sugercoffee.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;


    @PostConstruct
    public void init(){
        System.out.println("初始化方法");
    }

    public AlphaService(){
        System.out.println("实例化方法");

    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁方法");
    }

    public String find(){
        return alphaDao.select();
    }

}
