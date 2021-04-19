package org.pyro.spring.boot.demo.config;

import org.pyro.spring.boot.demo.model.Credential;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author ZYC MoronSlayer@outlook.com
 * @version 1.0
 * @date 2021/4/19 20:53
 */
@Component
@ConfigurationPropertiesBinding
public class CredentialConverter implements Converter<String, Credential> {
    
    @Override
    public Credential convert(String source) {
        String[] parameters = source.split(",");
        return new Credential(parameters[0], parameters[1]);
    }
}
