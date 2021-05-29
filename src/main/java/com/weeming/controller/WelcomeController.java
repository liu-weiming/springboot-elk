package com.weeming.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weeming
 * @date 2021/5/29
 */
@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/welcome")
    public String welcome() {
        logger.info("this is WelcomeController.welcome()");
        return "welcome to visit this site.";
    }

    @GetMapping("/{username}")
    public String welcome(@PathVariable("username") String username) {
        logger.info("this is WelcomeController.welcome({username})");
        return "welcome " + username + " to visit this website.";
    }

}
