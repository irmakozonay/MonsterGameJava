package com.irmak;

import com.irmak.model.Cannon;
import com.irmak.model.Catapult;
import com.irmak.model.Player;
import com.irmak.model.Stick;

public class App {
	
	public static void main(String[] args) {
		Game game = new Game();
		//game.startGame();
		
		Attack attack = new SuperAttack();
		System.out.println(attack.addNumbers(5, 4));
		System.out.println(Attack.multiplyNumbers(2, 3));
		
//		Player player = new Player("Ayse Oner", 20);
//		player.addTool(new Stick());
//		player.addTool(new Cannon());
//		player.addTool(new Catapult());
//		player.addTool(new Stick());
//		player.printTools();
//		player.refillTools();
	}
	
}
