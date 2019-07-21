package com.wiscom.bus.app.server.controller;

import com.wiscom.bus.app.server.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TestController {

    @GetMapping("/test")
    public Result  test(Principal principal){
        return new Result("ok   ");
    }
}
