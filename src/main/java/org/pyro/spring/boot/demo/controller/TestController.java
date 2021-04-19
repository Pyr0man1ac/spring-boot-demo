package org.pyro.spring.boot.demo.controller;

import org.pyro.spring.boot.demo.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author ZYC MoronSlayer@outlook.com
 * @version 1.0
 * @date 2021/4/19 20:03
 */
@RestController
@RequestMapping("test")
public class TestController {
    
    @Resource
    private TestService testService;
    
    @GetMapping
    public String test() {
        testService.test();
        return new Date().toString();
    }
    
}
