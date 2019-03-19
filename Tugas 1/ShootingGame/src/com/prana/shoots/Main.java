package com.prana.shoots;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inisialisasi myPlayer
		Upgrade myUpgradePlayer = new PlayerUpgrade();
		Player myPlayer = new Player("Prana", 100, myUpgradePlayer);
		System.out.println("From code : " + myPlayer.getWeaponUpgrade());
		
		ClassPathXmlApplicationContext enemyContext =
				new ClassPathXmlApplicationContext("ShootXML.xml");
		
		ClassPathXmlApplicationContext playerContext =
				new ClassPathXmlApplicationContext("ShootXML.xml");
	
		Player myPlayer2 = playerContext.getBean("myPlayer", Player.class);
		Enemy myMafia = enemyContext.getBean("myMafia", Mafia.class);
		
		Enemy myBoss = enemyContext.getBean("myBossTXT", Boss.class);
//		Player myPlayer2 = playerContext.getBean("myPlayer2", Player.class);
		System.out.println(myMafia.Attack());
		System.out.println("From XML : " + myPlayer2.getWeaponUpgrade());
		System.out.println("From file : " + ((Human)myBoss).getName());
//		System.out.println("From XML : " myPlayer.getWeaponUpgrade());
//		System.out.println("From XML : " + myPlayer2.getName());

	}

}
