package com.lover.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: 李惠福
 * @Create: 2019/5/31  17:22
 */
@SpringBootApplication
@EnableEurekaClient
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class);
    }
}
