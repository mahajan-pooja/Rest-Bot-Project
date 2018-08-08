package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.example.demo.*"})
@SpringBootApplication(scanBasePackages={"com.example.demo", "com.example.demo.bean", "com.example.demo.controller",
	"com.example.demo.dao", "com.example.demo.service"})
@PropertySource(value = {"classpath:application.properties", "file:${config.home}/example/demo/application-override.properties"},ignoreResourceNotFound = true)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
