package org.pyro.spring.boot.demo.controller;

import org.pyro.spring.boot.demo.service.LazyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ZYC MoronSlayer@outlook.com
 * @version 1.0
 */
@RestController
@RequestMapping("lazy")
public class LazyController {
    
    @Resource
    private LazyService lazyService;
    
    @GetMapping
    public void test() {
        lazyService.test();
    }
    
}
