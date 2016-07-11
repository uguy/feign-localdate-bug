package com.foo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableEurekaClient
@SpringBootApplication
@EnableConfigurationProperties
public class ApplicationServer {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationServer.class, args);
	}
}
