package com.nickpug9.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nickpug9.task"})
@EnableJpaRepositories(basePackages = "com.nickpug9.task.repository")
@EntityScan(basePackages = "com.nickpug9.task.entity")
public class TaskApplication {
	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}
}
