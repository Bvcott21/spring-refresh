package com.bvcott.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Eat up");
	}

	@Override
	public void down() {
		System.out.println("Eat down");
	}

	@Override
	public void left() {
		System.out.println("Eat left");
	}

	@Override
	public void right() {
		System.out.println("Eat right");
	}

}
