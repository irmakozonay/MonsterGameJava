package com.irmak.model;

public class Cannon extends Tool {
	
	private static final int INITIAL_CANNON_BALL_COUNT = 5;
	private int numberOfCannonBalls;
	
	public Cannon() {
		super(20, 25);
		this.numberOfCannonBalls = INITIAL_CANNON_BALL_COUNT;
	}
	
	public int getNumberOfCannonBalls() {
		return numberOfCannonBalls;
	}
	public void setNumberOfCannonBalls(int numberOfCannonBalls) {
		this.numberOfCannonBalls = numberOfCannonBalls;
	}
	
	@Override
	public void refill() {
		this.numberOfCannonBalls = INITIAL_CANNON_BALL_COUNT;
		System.out.println("cannon refill");
	}

	@Override
	public String toString() {
		return "Cannon [numberOfCannonBalls=" + numberOfCannonBalls + ", getPower()=" + getPower() + ", getPrice()="
				+ getPrice() + "]";
	}

}
