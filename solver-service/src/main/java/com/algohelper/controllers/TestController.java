package com.algohelper.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dawid Pawlak.
 */

@RestController
public class TestController {

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String enter() {
        return "test";
    }

}
