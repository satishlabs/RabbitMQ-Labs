package com.satishlabs.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRabbitMQTestApplication implements CommandLineRunner{
	static Logger logInfo = LoggerFactory.getLogger(MyRabbitMQTestApplication.class);
	
	public static void main(String[] args) {
		logInfo.info("MyRabbitMQTestApplication --- begin");
		SpringApplication.run(MyRabbitMQTestApplication.class, args);
		logInfo.info("MyRabbitMQTestApplication --- end");
	}

	public void run(String... args) throws Exception {
		logInfo.info("MyRabbitMQTestApplication --- launch");
		
	}
}
