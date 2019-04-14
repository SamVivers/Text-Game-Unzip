package com.qa.SamsGame.Text_Game;


public class Wisp extends Encounter{
	
	public void local() {
		System.out.println(Player.getName() + " is attracted to a glowing Will o' the Wisp and follows it blindly into the deep swamp, "
				+ "\nnever to return...");
		Player.setHealth(0);
	}
}
