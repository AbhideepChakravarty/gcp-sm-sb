/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msc.ecomm.gcpsmdemo;

/**
 *
 * @author M1011280
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSecretController {

    @Value("${sm://ecomm-api-dev-mscdirect-dbUser}")
    String user;
    
    @Value("${sm://projects/927261410394/secrets/ecomm-api-dev-mscdirect-dbPswd}")
    String pwd;

    @GetMapping("/")
    public String hello() {
        return user + " | " + pwd;
    }
}
