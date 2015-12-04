package com.algohelper.controllers;

import com.algohelper.clients.SolverServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dawid Pawlak.
 */

@RestController
public class SolveController {

    @Autowired
    private SolverServiceClient solverServiceClient;

    @RequestMapping(value="/solve", method= RequestMethod.GET)
    public String solver() {
        return solverServiceClient.solveTest();
    }

}
