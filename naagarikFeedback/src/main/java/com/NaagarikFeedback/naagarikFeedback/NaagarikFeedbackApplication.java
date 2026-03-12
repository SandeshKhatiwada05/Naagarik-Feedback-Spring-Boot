package com.NaagarikFeedback.naagarikFeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NaagarikFeedbackApplication {

	public static void main(String[] args) {
		System.out.println("Click this link"+ "localhost:8080/feedbacks");
		SpringApplication.run(NaagarikFeedbackApplication.class, args);
	}

}
