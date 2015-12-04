package com.algohelper.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Dawid Pawlak.
 */

@FeignClient("solver-service")
public interface SolverServiceClient {

    @RequestMapping(value="/solver-service-test", method= RequestMethod.GET)
    String solveTest();

}
