package org.pyro.spring.boot.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZYC MoronSlayer@outlook.com
 * @version 1.0
 * @date 2021/4/19 20:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Credential {
    
    private String username;
    
    private String password;
    
}
