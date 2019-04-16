package com.qa.SamsGame.Text_Game;

import java.util.Scanner;

public class Player {
	private Player() {
	    throw new IllegalStateException("Utility class");
	  }
	
	private static int health;
	private static int attack;
	private static int defence;
	private static int loot;
	private static String name;
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Player.name = name;
	}
	public static int getHealth() {
		return health;
	}
	public static void setHealth(int health) {
		Player.health = health;
	}
	public static int getAttack() {
		return attack;
	}
	public static void setAttack(int attack) {
		Player.attack = attack;
	}
	public static int getDefence() {
		return defence;
	}
	public static void setDefence(int defence) {
		Player.defence = defence;
	}
	public static int getLoot() {
		return loot;
	}
	public static void setLoot(int loot) {
		Player.loot = loot;
	}
	
	public static void name() {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("In this text based adventure game you must navigate, survive and escape from a mysterious swamp. "
				+ "\nYou will be promted to make choices by entering keyword, shown in brackets i.e. (Leave), "
				+ "\nas a shorthand you can just use the initail of the keyword, i.e. (L), and nothing is case sensitive. "
				+ "\nWould you like to (Name) your character, or use the (Default)");
		String yes = keyboardInput.nextLine();
		if (yes.equalsIgnoreCase("N") || yes.equalsIgnoreCase("Name")) {
			System.out.println("Please name your charachter");
			String nam = keyboardInput.nextLine();
			System.out.println("Hello " + nam + " try not to die."
					+ "\nWould you like to (Set) your starting Stats, or use the (Default)");
			String set = keyboardInput.nextLine();
			if (set.equalsIgnoreCase("S") || set.equalsIgnoreCase("set")) {
				System.out.println("Enter desired Health");
				int hel = keyboardInput.nextInt();
				System.out.println("Enter desired Attack");
				int att = keyboardInput.nextInt();
				System.out.println("Enter desired Defence");
				int def = keyboardInput.nextInt();
				choose(nam, hel, att, def);
			} else {
				choose(nam);
			}
		} else {
			choose();
		}		
	}
	
	public static void choose() {
		name = "Sam";
		health = 10;
		attack = 10;
		defence = 10;
	}
	public static void choose(String nam) {
		name = nam;
		health = 10;
		attack = 10;
		defence = 10;
	}
	public static void choose(String nam, int hel, int att, int def) {
		name = nam;
		health = hel;
		attack = att;
		defence = def;
	}
}

