package com.prana.shootsAno;

import org.springframework.stereotype.Component;

@Component
public class PlayerUpgrade implements Upgrade {

	@Override
	public String weaponUpgrade(String name) {
		return name + " weapon become Stronger!";
	}

}
