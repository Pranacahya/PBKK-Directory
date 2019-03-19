package com.prana.shootsAno;

import org.springframework.stereotype.Component;

@Component
public class Boss extends Human implements Enemy {
	public Boss()
	{
		
	}
	@Override
	public String Attack() {
		return "Boss Attack!";
	}
}
