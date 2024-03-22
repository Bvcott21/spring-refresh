package com.bvcott.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bvcott.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
				SpringApplication.run(
						LearnSpringFrameworkApplication.class, 
						args);
		
		GameRunner runner = ctx.getBean(GameRunner.class);
		runner.run();
		
	}

}
