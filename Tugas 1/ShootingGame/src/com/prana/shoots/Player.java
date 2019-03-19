package com.prana.shoots;

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
	
	public void setWeaponUpgrade(Upgrade pWUpgrade)
	{
		myUpgrade = pWUpgrade;
	}
	
}
