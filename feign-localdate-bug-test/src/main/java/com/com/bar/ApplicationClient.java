package com.com.bar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by fmarsaud on 11/07/16.
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class ApplicationClient {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationClient.class, args);
    }
}
