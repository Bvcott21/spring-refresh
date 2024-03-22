package com.bvcott.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;

public class GameRunner {
	@Autowired private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
