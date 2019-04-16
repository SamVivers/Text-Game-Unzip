package com.qa.SamsGame.Text_Game;

import java.util.Scanner;

public class Enemy {
	private String type;
	private int health;
	private int attack;
	private int defence;
	
	Enemy(String type, int health, int attack, int defence) {
		this.type = type;
		this.health = health;
		this.attack = attack;
		this.defence = defence;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	public void fight() {
		while (Player.getHealth() != 0 || health != 0) {
			int damP = (int) (Math.random() * Player.getAttack()) + Player.getAttack() - defence;
			int damE = (int) (Math.random() * attack) + attack - Player.getDefence();
			if (damP > 0) {
				System.out.println(Player.getName() + "'s attack deals " + damP + " damage.");
				health -= damP;
			} else {
				System.out.println("Oh, and thats a bad miss!");
			}
			if (health <= 0) {
				break;
			}
			if (damE > 0) {
				System.out.println(type + "'s attack deals " + damE + " damage.");
				Player.setHealth(Player.getHealth() - damE);
			} else {
				System.out.println("Sic dodge bro!");
			}
			if (Player.getHealth() <= 0) {
				return;
			}
			System.out.println("Would you like to (Run) or continue the (Fight)?");
			Scanner keyboardInput = new Scanner(System.in);
			String inv = keyboardInput.nextLine();
			if (inv.equalsIgnoreCase("R") || inv.equalsIgnoreCase("run")) {
				System.out.println("You turn tail and sprint away. Coward!");
				break;
			} else if (inv.equalsIgnoreCase("C") || inv.equalsIgnoreCase("check")) {
				System.out.println("Health: " + Player.getHealth()
				+ "\nAttack: " + Player.getAttack()
				+ "\nDefence: " + Player.getDefence()
				+ "\nLoot: " + Player.getLoot());
			}
		}
	}
}
