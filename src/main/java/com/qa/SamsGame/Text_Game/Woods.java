package com.qa.SamsGame.Text_Game;

import java.util.Scanner;

public class Woods {
	
	public void local() {
		System.out.println("You arrive at a base of a small hill with a covering of dense trees, (Climb) the hill or (Leave)?");
		Scanner keyboardInput = new Scanner(System.in);
		String inv = keyboardInput.nextLine();
		if (inv.equalsIgnoreCase("C") || inv.equalsIgnoreCase("Climb")) {
			int n = (int)(Math.random() * 2);
			if (n == 0) {
				System.out.println("You move deeper into the trees, glancing up you realise you cannot see the sky, "
						+ "just a shifting sea of black feathers. "
						+ "\nYou hear a sharp chorus of 'Caws' and are suddenly beset by seemingly innumerable sharp beaks and claws. "
						+ "\nWith no way to fight back you flee the woods, receiving lacerations to your head and arms.");	
				Player.setHealth(Player.getHealth() - 2);
			} else {
				System.out.println("In the middle of the wood you stumble upon a small cabin, the door creaks open and you are greeted by a wrinked old woman "
						+ "\nwearing a long pointed black hat, carrying broomstick, with a black cat 'meowing' at her ankles, "
						+ "\ndo you (Fight) or (Talk)?");
				String act = keyboardInput.nextLine();
				if (act.equalsIgnoreCase("F") || act.equalsIgnoreCase("Fight")) {
					System.out.println("With no provacation you assault old the helpless old lady, "
							+ "\nher frail body crumples under your blows and she lies dead at you feet. "
							+ "\nLike the heartless bastard you are, you ransack the cabin for loot.");
					Player.setLoot(Player.getLoot() + 2);
				} else {
					int m = (int)(Math.random() * 2);
					if (m == 0) {
						System.out.println("Polly introduces herself and her cat Mittens, she offers hot food and a warm bed for the night. "
								+ "\nYou awake feeling rested and refeshed, as you ready yourself to continue your journey, "
								+ "\nPolly presents you with a old shield which had once been her husbands."
								+ "\nYou thank her perfusely and head back out into the swamp");
						Player.setHealth(10);
						Player.setDefence(Player.getDefence() + 6);
					} else {
						System.out.println("Polly introduces herself and her cat Mittens, she offers hot food and a warm bed for the night. "
								+ "You awake at the foot of the hill, with you stomch churning and all your Loot missing. "
								+ "\nWhen you climb the hill and enter the woods, to find Polly and lambast her for poisoning you and stealing your Loot, "
								+ "\nyou find the cabin empty and deserted. You have little choice but to move on.");
						Player.setLoot(0);
						Player.setHealth(Player.getHealth() - 2);
					}
				}
			}
		} else {
			System.out.println("Perhaps causion is a wise choice, you move on");
		}
	}		
}

