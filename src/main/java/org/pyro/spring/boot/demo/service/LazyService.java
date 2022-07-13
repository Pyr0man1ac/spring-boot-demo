package org.pyro.spring.boot.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author ZYC MoronSlayer@outlook.com
 * @version 1.0
 */
@Slf4j
@Service
public class LazyService {
    
    @Lazy
    @Resource
    private LazyComponent lazyComponent;
    
    public void test() {
        log.info("Lazy test START");
        log.info(Objects.toString(lazyComponent));
        log.info("Lazy test FINISH");
    }
    
    @Lazy
    @Slf4j
    @Component
    public  static class LazyComponent {
        
        public LazyComponent() {
            log.info("LazyComponent initialize");
        }
        
    }
    
}
