package com.example.Eval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.Eval")
public class EvalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvalApplication.class, args);
	}

}
