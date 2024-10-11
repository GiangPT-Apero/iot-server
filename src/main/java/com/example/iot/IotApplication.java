package com.example.iot;

import com.example.iot.controller.MqttController;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IotApplication {

	public static void main(String[] args) {

		SpringApplication.run(IotApplication.class, args);
	}

	@Bean
	CommandLineRunner run(MqttController mqttController) {
		return args -> {
			try {
				mqttController.sendMessage("home/sensors/data", "Hello from Spring Boot!");
			} catch (MqttException e) {
				e.printStackTrace();
			}
		};
	}
}
