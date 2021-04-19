package org.pyro.spring.boot.demo.service;

import org.pyro.spring.boot.demo.config.TestProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ZYC MoronSlayer@outlook.com
 * @version 1.0
 * @date 2021/4/19 20:07
 */
@Service
public class TestService {
    
    @Resource
    private ApplicationContext applicationContext;
    
    @Resource
    private TestProperties config;
    
    public void test() {
        System.out.println(this.applicationContext);
        System.out.println(config);
    }
    
}
