package org.pyro.spring.boot.demo.service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author ZYC MoronSlayer@outlook.com
 * @version 1.0
 */
@Slf4j
@Service
public class AsyncService {
    
    @Resource
    private AnotherAsyncService anotherAsyncService;
    
    public void test() {
        log.info("IN AsyncService");
        anotherAsyncService.test();
        log.info("FIN");
    }
    
    @Slf4j
    @Service
    public static class AnotherAsyncService {
    
        @Async
        @SneakyThrows
        public void test() {
            TimeUnit.SECONDS.sleep(3);
            log.info("IN AnotherAsyncService");
        }
        
    }
    

}
