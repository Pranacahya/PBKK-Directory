package com.prana.shootsAno;

import org.springframework.stereotype.Component;

@Component
public class Mafia extends Human implements Enemy{
	
	@Override
	public String Attack() {
		return "Mafia Attack!";
	}

}
