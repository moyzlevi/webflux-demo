package com.moyses.webfluxStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebfluxStudyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WebfluxStudyApplication.class, args);
		SaudacaoClient saudacaoClient = context.getBean(SaudacaoClient.class);
		System.out.println(">> message = " + saudacaoClient.getMensagem().block());

	}

}
