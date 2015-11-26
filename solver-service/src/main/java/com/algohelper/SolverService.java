package com.algohelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Dawid Pawlak.
 */

@EnableDiscoveryClient
@SpringBootApplication
public class SolverService {
    public static void main(String[] args) {
        SpringApplication.run(SolverService.class, args);
    }
}
