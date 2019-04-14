package com.qa.SamsGame.Text_Game;

import java.util.Scanner;

public class Lair extends Encounter{
	
	public void local() {
		System.out.println("You see the embers of a cook fire at the mouth of dark cave, (Enter) the cave or (Leave)?");
		Scanner keyboardInput = new Scanner(System.in);
		String inv = keyboardInput.nextLine();
		if (inv.equalsIgnoreCase("E") || inv.equalsIgnoreCase("enter")) {
			int n = (int)(Math.random() * 4);
			if (n == 0) {
				System.out.println("The cave is deserted and you find nothing of interest");	
			} else if (n == 1) {
				int m = (int)(Math.random() * 3);
				if (m == 0) {
					System.out.println("The cave is deserted but you find a sword left by a previous traveller");
					Player.setAttack(16);
				} else if (m == 1) {
					System.out.println("The cave is deserted but you find a rusty helm left by a previous traveller");
					Player.setDefence(Player.getDefence() + 2);
				} else {
					System.out.println("The cave is deserted but you find some loot");
					Player.setLoot(Player.getLoot() + 2);
				}
			} else if (n == 2) {
				System.out.println("A brigand has sought shelter in the cave, he greets you with a greedy smile and draws a knife"
						+ "\ndo you (Fight) or (Run)?");
				String act = keyboardInput.nextLine();
				if (act.equalsIgnoreCase("F") || act.equalsIgnoreCase("Fight")) {
					System.out.println("You stand your ground as he leaps forward, sidestepping his first blow you move to attack.");
					Enemy scum = new Enemy("Brigand", 12, 8, 6);
					scum.fight();
					if (Player.getHealth() <= 0) {
						return;
					}	
					System.out.println("With you foe dispatched, you gather the loot he had been hording and exit the cave");
					Player.setLoot(Player.getLoot() + 2);
					if (Player.getAttack() < 12) {
						System.out.println("You also claim the brigands knife");
						Player.setAttack(12);
					}
				} else {
					System.out.println("You flee the cave and press on deeper into the swamp.");
				}
			} else {
				System.out.println("The cave seems deserted, then suddenly an Ogre bursts from the darkness wielding a heavy club, "
						+ "\ndo you (Fight) or (Run)?");
				String act = keyboardInput.nextLine();
				if (act.equalsIgnoreCase("F") || act.equalsIgnoreCase("Fight")) {
					System.out.println("You charge at the beast ducking under its club and a brutal close quarters scrap ensues.");
					Enemy shrek = new Enemy("Ogre", 20, 10, 16);
					shrek.fight();
					if (Player.getHealth() <= 0) {
						return;
					}	
					System.out.println("The monster lies dead at your feet. You gather the loot it had been hording and exit the cave");
					Player.setLoot(Player.getLoot() + 5);
				} else {
					System.out.println("As you flee a shaprened stalactite catches you shoulder opening a nasty gash");
					Player.setHealth(Player.getHealth() - 1);
				}
			}			
		} else {
			System.out.println("Perhaps causion is a wise choice, you move on");
		}
	}		
}
