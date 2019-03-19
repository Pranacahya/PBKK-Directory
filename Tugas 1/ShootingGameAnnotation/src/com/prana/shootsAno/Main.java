package com.prana.shootsAno;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inisialisasi myPlayer
		Upgrade myUpgradePlayer = new PlayerUpgrade();
		Player myPlayer = new Player("Prana", 100, myUpgradePlayer);
		System.out.println("From code : " + myPlayer.getWeaponUpgrade());
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("ShootXML.xml");
		
		Player myPlayer2 = context.getBean("player", Player.class);
		Enemy myMafia = context.getBean("mafia", Mafia.class);
		
		Enemy myBoss = context.getBean("boss", Boss.class);
//		Player myPlayer2 = playerContext.getBean("myPlayer2", Player.class);
		System.out.println(myMafia.Attack());
		System.out.println("Annotation1 : " + myPlayer2.getWeaponUpgrade());
		System.out.println("Annotation2 : " + ((Human)myBoss).getName());
//		System.out.println("From XML : " myPlayer.getWeaponUpgrade());
//		System.out.println("From XML : " + myPlayer2.getName());

	}

}
