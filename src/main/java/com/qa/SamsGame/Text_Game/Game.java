package com.qa.SamsGame.Text_Game;

import java.util.Scanner;

public class Game {
	
	private int xP;
	private int yP;
	private int xT;
	private int yT;

	public void spawnP() {
		xP = (int)(Math.random() * 20);
		yP = (int)(Math.random() * 20);
	}
	public void spawnT() {
		xT = (int)(Math.random() * 20);
		yT = (int)(Math.random() * 20);
		while (xP == xT && yP == yT) {
			xT = (int)(Math.random() * 20);
			yT = (int)(Math.random() * 20);
		}
	}
	public double dist() {
		return Math.sqrt(Math.pow(Math.abs((double) xT - (double) xP), 2) + Math.pow(Math.abs((double) yT - (double) yP), 2));
	}
	
	public void move() {
		Scanner keyboardInput = new Scanner(System.in);
		boolean m = true;
		while (m) {	
			System.out.println("Which dirrection (North), (South), (East), (West) would you like to move in?"
					+ "\n Or you can (Check) your stats");
			String mov = keyboardInput.nextLine();
			if (mov.equalsIgnoreCase("N") || mov.equalsIgnoreCase("north")) {
				yP++;
				m = false;
			} else if (mov.equalsIgnoreCase("E") || mov.equalsIgnoreCase("east")) {
				xP++;
				m = false;
			} else if (mov.equalsIgnoreCase("S") || mov.equalsIgnoreCase("south")) {
				yP--;
				m = false;
			} else if (mov.equalsIgnoreCase("W") || mov.equalsIgnoreCase("west")) {
				xP--;
				m = false;
			} else if (mov.equalsIgnoreCase("C") || mov.equalsIgnoreCase("check")) {
				System.out.println("Health: " + Player.getHealth()
						+ "\nAttack: " + Player.getAttack()
						+ "\nDefence: " + Player.getDefence()
						+ "\nLoot: " + Player.getLoot());
			}
		}
	}
	
	
	public void play() {
		System.out.println("Let us begin...\n");
		spawnP();
		spawnT();
		System.out.println(Player.getName() + " awakes in a mirky swamp, the compass reads " + dist());
		while (xP != xT || yP != yT) {
			Wisp wi = new Wisp();
			Lair l = new Lair();
			Woods w = new Woods();
			Empty e = new Empty();
			int n = (int)(Math.random() * 20);
			if (n == 0) {
				wi.local();
			} else if (n >= 1 && n <= 4) {
				l.local();
			} else if (n >= 5 && n <= 8){	
				w.local();
			} else {
				e.local();
			}
			if (Player.getHealth() <= 0) {
				break;
			}
			move();
			System.out.println("Your compass reads " + dist());
		}
		if (Player.getHealth() <= 0) {
			System.out.println("Game Over");
		} else {
			System.out.println("You have found the Treasure and escaped with " + Player.getLoot() + " Loot. Congratulations!");
		}
	}
}
