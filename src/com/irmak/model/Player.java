package com.irmak.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

import com.irmak.Attack;
import com.irmak.StaticMethods;

public class Player extends GameElement {
	private String name;
	private int age;
//	private Stick stick;
//	private Catapult catapult;
//	private Cannon cannon;
//	private Stick stick2;
	
	ArrayList<Tool> tools;
	
	public Player(String name, int age) {
		this.name = name;
		setAge(age);
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		if (age < 10) {
			throw new IllegalArgumentException("Age should be greater than 10");
		}
		this.age = age;
	}
	
	public void addTool(Tool tool) {
		if (tools == null) {
			tools = new ArrayList<>();
		}
		tools.add(tool);
	}
	
	public void printTools() {
		for (Tool tool : tools) {
			System.out.println(tool);
		}
	}
	
	public void refillTools() {
		for (Tool tool : tools) {
			tool.refill();
		}
	}
	
	@Override
	public int getAttackPoint(Attack attack) {
		return StaticMethods.getRandomNumber(1, 10);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Player))
			return false;
		Player other = (Player) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if (!(obj instanceof Player)) {
//			return false;
//		}
//		Player other = (Player) obj;
//		return age == other.age && name == other.name;
//	}
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}
	
}
