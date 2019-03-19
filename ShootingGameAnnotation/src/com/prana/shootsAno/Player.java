package com.prana.shootsAno;

import com.prana.shootsAno.Human;
import com.prana.shootsAno.Upgrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player extends Human{
	private Upgrade myUpgrade;
	
	public Player()
	{
		
	}
	public Player(Upgrade upgrade)
	{
		myUpgrade = upgrade;
	}
	public Player(String name, int health, Upgrade upgrade) 
	{
		setHealth(health);
		setName(name);
		myUpgrade = upgrade;
	}

	public String Run()
	{
		return "I'm running";
	}
	
	public String Shoot()
	{
		return "I'm shooting";
	}

	public String getWeaponUpgrade()
	{
		return myUpgrade.weaponUpgrade(getName());
	}
	
	@Autowired
	public void setWeaponUpgrade(Upgrade pWUpgrade)
	{
		myUpgrade = pWUpgrade;
	}
	
}
