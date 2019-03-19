package com.prana.shootsJava;

import org.springframework.beans.factory.annotation.Value;

public class Human {
	@Value("100")
	int Health;
	@Value("Prana")
	String name;
	public int getHealth() {
		return Health;
	}

	public void setHealth(int health) {
		Health = health;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
