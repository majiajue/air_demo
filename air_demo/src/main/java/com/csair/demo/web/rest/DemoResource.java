package com.csair.demo.web.rest;

import com.csair.demo.web.rest.vm.LoginVM;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Demo controller
 */
@RestController
@RequestMapping("/api/demo")
public class DemoResource {

    private final Logger log = LoggerFactory.getLogger(DemoResource.class);

    /**
    * POST demo
    */
    @PostMapping("/demo")
    public String demo() {
        log.info("進入了api演示");
        RestTemplate restTemplate = new RestTemplate();
        LoginVM login = new LoginVM();
        login.setPassword("admin");
        login.setUsername("admin");
        ResponseEntity<LoginVM> responseEntity = restTemplate.postForEntity("http://39.104.83.25:8761/api/authenticate", login, LoginVM.class);
        log.info("獲得參數"+responseEntity.getBody());
        return "demo";
    }

    /**
    * POST api
    */
    @PostMapping("/api")
    public String api() {
        return "api";
    }

}
