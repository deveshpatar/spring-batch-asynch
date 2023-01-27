package com.devesh.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("file:E:\\DEVTOOLS\\WorkSpace\\application.properties")
@PropertySource("file:/app/properties/application.properties")
public class SpringBootBatchApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBatchApplication.class, args);
	}
	
}
