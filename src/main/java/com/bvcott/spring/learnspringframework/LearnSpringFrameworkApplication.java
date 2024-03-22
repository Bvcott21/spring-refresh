package com.bvcott.spring.learnspringframework;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bvcott.spring.learnspringframework.game.GameRunner;
import com.bvcott.spring.learnspringframework.game.GamingConsole;
import com.bvcott.spring.learnspringframework.game.MarioGame;
import com.bvcott.spring.learnspringframework.game.PacmanGame;
import com.bvcott.spring.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GamingConsole marioGame = new MarioGame();
		GamingConsole contraGame = new SuperContraGame();
		GamingConsole pacmanGame = new PacmanGame();
		
		GameRunner marioGameRunner = new GameRunner(marioGame);
		marioGameRunner.run();
		System.out.println("\n-----");
		
		GameRunner superContraGameRunner = new GameRunner(contraGame);
		superContraGameRunner.run();
		System.out.println("\n-----");
		
		GameRunner pacmanGameRunner = new GameRunner(pacmanGame);
		pacmanGameRunner.run();
	}

}
