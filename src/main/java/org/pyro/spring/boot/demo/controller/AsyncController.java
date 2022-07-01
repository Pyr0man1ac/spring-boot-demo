package org.pyro.spring.boot.demo.controller;

import org.pyro.spring.boot.demo.service.AsyncService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ZYC MoronSlayer@outlook.com
 * @version 1.0
 */
@RestController
@RequestMapping("async")
public class AsyncController {
    
    @Resource
    private AsyncService asyncService;
    
    @GetMapping
    public void test() {
        asyncService.test();
    }
    
}
