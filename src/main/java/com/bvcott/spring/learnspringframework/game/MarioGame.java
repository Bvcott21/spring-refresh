package com.bvcott.spring.learnspringframework.game;

public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("jump");
	}
	
	public void down() {
		System.out.println("down into a hole");
	}
	
	public void left() {
		System.out.println("accelerate");
	}
	
	public void right() {
		System.out.println("stop");
	}
}
