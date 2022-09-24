package com.irmak.model;

import com.irmak.Attack;
import com.irmak.Game;

public abstract class GameElement {
	
	private int health;
	
	public GameElement() {
		setHealth(Game.FULL_HEALTH);
	}
	
	private void setHealth(int health) {
		if (health > Game.FULL_HEALTH) {
			throw new IllegalArgumentException("Health should be smaller than " + Game.FULL_HEALTH);
		}
		this.health = health;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void resetHealth() {
		health = Game.FULL_HEALTH;
	}
	
	public void decreaseHealth(int points) {
		health = health - points;
	}
	
	public boolean isAlive() {
		return health > 0;
	}
	
	public abstract int getAttackPoint(Attack attack);

}
