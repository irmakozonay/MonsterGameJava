package com.irmak;

public class ExtremeAttack implements Attack {

	@Override
	public int calculateAttackPoints(int attackPoints) {
		System.out.println("EXTEREME ATTACK");
		return attackPoints * 3;
	}
	
}
