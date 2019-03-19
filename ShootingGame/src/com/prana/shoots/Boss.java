package com.prana.shoots;

public class Boss extends Human implements Enemy {
	public Boss()
	{
		
	}
	@Override
	public String Attack() {
		return "Boss Attack!";
	}
}
