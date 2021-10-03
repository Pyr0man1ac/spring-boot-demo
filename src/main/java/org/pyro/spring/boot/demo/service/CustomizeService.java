package org.pyro.spring.boot.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.pyro.spring.boot.demo.config.CustomizeProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author ZYC MoronSlayer@outlook.com
 * @version 1.0
 * @date 2021/4/19 20:07
 */
@Slf4j
@Service
public class CustomizeService {
    
    @Resource
    private ApplicationContext applicationContext;
    
    @Resource
    private Environment environment;
    
    @Resource
    private CustomizeProperties config;
    
    public void test() {
        log.info(Objects.toString(this.applicationContext));
        log.info(Objects.toString(this.environment));
        log.info(Objects.toString(config));
    }
    
}
