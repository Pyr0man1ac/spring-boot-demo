package org.pyro.spring.boot.demo.config;

import lombok.Data;
import org.pyro.spring.boot.demo.model.Credential;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

/**
 * @author ZYC MoronSlayer@outlook.com
 * @version 1.0
 * @date 2021/4/19 20:18
 */
@Data
@Configuration
@ConfigurationProperties("customize")
public class CustomizeProperties {
    
    private Long id;
    
    private String code;
    
    private Boolean enable;
    
    private List<String> stringList;
    
    private List<String> anotherStringList;
    
    private Map<String, Boolean> booleanMap;
    
    private Map<String, String> stringMap;
    
    private Credential credential;
    
    private Credential credentialWithConverter;
    
}
