package com.eventoapp.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class EventoAppApplication {


	public static void main(String[] args) {
		SpringApplication.run(EventoAppApplication.class, args);
	}
}