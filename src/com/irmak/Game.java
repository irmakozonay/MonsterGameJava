package com.irmak;

import java.util.Scanner;

import com.irmak.model.Monster;
import com.irmak.model.Player;
import com.irmak.model.Stick;

public class Game {
	
	public static final int FULL_HEALTH = 100;
	
	private Monster monster;
	private Player player;

	public void startGame() {
		buildPlayer();
		buildMonster();
		do {
			startAttacks();
			resetHealths();
		} while (shouldContinue());
	}

	private void startAttacks() {
		int round = 1;
		while (monster.isAlive() && player.isAlive()) {
			System.out.println("ROUND:" + round);
			System.out.println("Player " + player.getName() + " attack");
			monster.decreaseHealth(player.getAttackPoint(new NormalAttack()));
			
			if (!monster.isAlive()) {
				break;
			}
			
			System.out.println("Monster " + monster.getType() + " attack");
			Attack attack = new NormalAttack();
			if (round == 3) {
				attack = new SuperAttack();
			} else if (round == 18) {
				attack = new ExtremeAttack();
			}
			player.decreaseHealth(monster.getAttackPoint(attack));
			
			printHealthStatus();
			round++;
		}
		
		System.out.println((player.isAlive() ? "Player" : "Monster") + " WINS!");
	}

	private void resetHealths() {
		monster.resetHealth();
		player.resetHealth();
	}

	private void printHealthStatus() {
		System.out.println("Player health:" + player.getHealth());
		System.out.println("Monster health:" + monster.getHealth());
	}
	
	private void buildPlayer() {
		String name = askName();
		int age = askAge();
		player = new Player(name, age);
	}
	
	private void buildMonster() {
		monster = new Monster("Big Head");
	}
	
	private int askAge() {
		System.out.println("Yasinizi giriniz:");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	private String askName() {
		System.out.println("Isminizi giriniz:");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	private boolean shouldContinue() {
		System.out.println("Tekrar oynat? Evet, Hayir");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		return answer.trim().toLowerCase().equals("evet");
	}
	
}
