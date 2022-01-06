package com.airline.airline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;




@EnableEurekaClient
@SpringBootApplication
public class AirlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineApplication.class, args);
	}

	// @Override
    // protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    //     return builder.sources(AirlineApplication.class);
    // }
}
