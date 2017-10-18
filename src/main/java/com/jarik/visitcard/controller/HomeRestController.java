package com.jarik.visitcard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YSkakun on 10/17/2017.
 */
@RestController
public class HomeRestController {

    @RequestMapping("/")
    public String home(){
        return "my visit card:TODO";
    }
}
