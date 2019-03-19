package com.prana.shootsJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShootsConfig {
	
	@Bean
	public PlayerUpgrade upgrade()
	{
		return new PlayerUpgrade();
	}
	
	@Bean
	public Player player()
	{
		return new Player();
	}
	
	@Bean
	public Enemy mafia()
	{
		Mafia myMafia = new Mafia();
		return myMafia;
	}
	
	@Bean
	public Boss boss() {
		return new Boss();
	}
}
