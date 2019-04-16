package com.qa.SamsGame.Text_Game;

public class Navigation {
	
	public static void compass() {
		double xD = Game.getxT() - Game.getxP();
		double yD = Game.getyT() - Game.getyP();
		
		if (xD == 0 && yD > 0) {
			System.out.println("   _________"
					+ "\n  /    N    \\"
					+ "\n /     ^     \\"
					+ "\n/      ^      \\"
					+ "\nW      o      E"
					+ "\n\\             /"
					+ "\n \\           /"
					+ "\n  \\____S____/");
		}
		if (xD == 0 && yD < 0) {
			System.out.println("   _________"
					+ "\n  /    N    \\"
					+ "\n /           \\"
					+ "\n/             \\"
					+ "\nW      o      E"
					+ "\n\\      v      /"
					+ "\n \\     v     /"
					+ "\n  \\____S____/");
		}
		if (yD == 0 && xD > 0) {
			System.out.println("   _________"
					+ "\n  /    N    \\"
					+ "\n /           \\"
					+ "\n/             \\"
					+ "\nW      o > > >E"
					+ "\n\\             /"
					+ "\n \\           /"
					+ "\n  \\____S____/");
		}
		if (yD == 0 && xD < 0) {
			System.out.println("   _________"
					+ "\n  /    N    \\"
					+ "\n /           \\"
					+ "\n/             \\"
					+ "\nW< < < o      E"
					+ "\n\\             /"
					+ "\n \\           /"
					+ "\n  \\____S____/");
		}
		if (yD == 0 && xD == 0) {
			System.out.println("	  |                   |                  |                     |"
			         + "\n _________|________________.=``_;=.______________|_____________________|_______"
			         + "\n |                   |  ,-`_,=``     ``=.|                  |"
			         + "\n |___________________|__`=._o``-._        ``=.______________|___________________"
			         + "\n          |                ``=._o``=._      _``=._                     |"
			         + "\n _________|_____________________:=._o `=._.`_.-=```=.__________________|_______"
			         + "\n |                   |    __.--` , ; ``=._o.` ,-```-._ `.   |"
			         + "\n |___________________|_._`  ,. .` ` `` ,  ``-._`-._   `. '__|___________________"
			         + "\n           |           |o``=._` , `` `; .`. ,  `-._`-._; ;              |"
			         + "\n  _________|___________| ;`-.o``=._; .` ` '`.`\\  . `-._ /_______________|_______"
			         + "\n |                   | |o;    ``-.o``=._``  `` ` ,__.--o;   |"
			         + "\n |___________________|_| ;     (#) `-.o ``=.`_.--`_o.-; ;___|___________________"
			         + "\n ____/______/______/___|o;._    `      ``.o|o_.--`    ;o;____/______/______/____"
			         + "\n /______/______/______/_`=._o--._        ; | ;        ; ;/______/______/______/_"
			         + "\n ____/______/______/______/__`=._o--._   ;o|o;     _._;o;____/______/______/____"
			         + "\n /______/______/______/______/____`=._o._; | ;_.--`o.--`_/______/______/______/_"
			         + "\n ____/______/______/______/______/_____`=.o|o_.--``___/______/______/______/____"
			         + "\n /______/______/______/______/______/______/______/______/______/______/______/_");
		}
		if (xD > 0 && yD < 0) {
			if (xD / yD > -0.8) {
				System.out.println("   _________"
						+ "\n  /    N    \\"
						+ "\n /           \\"
						+ "\n/             \\"
						+ "\nW      o      E"
						+ "\n\\      v      /"
						+ "\n \\      v    /"
						+ "\n  \\____S_v__/");
			} else if (xD / yD < -1.25) {
				System.out.println("   _________"
						+ "\n  /    N    \\"
						+ "\n /           \\"
						+ "\n/             \\"
						+ "\nW      o > _  E"
						+ "\n\\            >/"
						+ "\n \\           /"
						+ "\n  \\____S____/");
			} else {
				System.out.println("   _________"
						+ "\n  /    N    \\"
						+ "\n /           \\"
						+ "\n/             \\"
						+ "\nW      o>     E"
						+ "\n\\         >   /"
						+ "\n \\          >/"
						+ "\n  \\____S____/");
			}
		}
		if (xD > 0 && yD > 0) {
			if (xD / yD > 1.25) {
				System.out.println("   _________"
						+ "\n  /    N    \\"
						+ "\n /           \\"
						+ "\n/          _ >\\"
						+ "\nW      o >    E"
						+ "\n\\             /"
						+ "\n \\           /"
						+ "\n  \\____S____/");
			}else if (xD / yD < 0.8) {
				System.out.println("   _________"
						+ "\n  /    N  ^ \\"
						+ "\n /       ^   \\"
						+ "\n/       ^     \\"
						+ "\nW      o      E"
						+ "\n\\             /"
						+ "\n \\           /"
						+ "\n  \\____S____/");
			} else {
				System.out.println("   _________"
						+ "\n  /    N    \\"
						+ "\n /          >\\"
						+ "\n/         >   \\"
						+ "\nW      o>     E"
						+ "\n\\             /"
						+ "\n \\           /"
						+ "\n  \\____S____/");
			}
		}
		if (xD < 0 && yD > 0) {
			if (xD / yD < -1.25) {
				System.out.println("   _________"
						+ "\n  /    N    \\"
						+ "\n /           \\"
						+ "\n/< _          \\"
						+ "\nW    < o      E"
						+ "\n\\             /"
						+ "\n \\           /"
						+ "\n  \\____S____/");
			}else if (xD / yD > -0.8) {
				System.out.println("   _________"
						+ "\n  / ^  N    \\"
						+ "\n /   ^       \\"
						+ "\n/     ^       \\"
						+ "\nW      o      E"
						+ "\n\\             /"
						+ "\n \\           /"
						+ "\n  \\____S____/");
			} else {
				System.out.println("   _________"
						+ "\n  /    N    \\"
						+ "\n /<          \\"
						+ "\n/   <         \\"
						+ "\nW     <o      E"
						+ "\n\\             /"
						+ "\n \\           /"
						+ "\n  \\____S____/");
			}
		}
		if (xD < 0 && yD < 0) {
			if (xD / yD > 1.25) {
				System.out.println("   _________"
						+ "\n  /    N    \\"
						+ "\n /           \\"
						+ "\n/             \\"
						+ "\nW  _ < o      E"
						+ "\n\\<            /"
						+ "\n \\           /"
						+ "\n  \\____S____/");
			}else if (xD / yD < 0.8) {
				System.out.println("   _________"
						+ "\n  /    N    \\"
						+ "\n /           \\"
						+ "\n/             \\"
						+ "\nW      o      E"
						+ "\n\\      v      /"
						+ "\n \\    v      /"
						+ "\n  \\__v_S____/");
			} else {
				System.out.println("   _________"
						+ "\n  /    N    \\"
						+ "\n /           \\"
						+ "\n/             \\"
						+ "\nW     <o      E"
						+ "\n\\   <         /"
						+ "\n \\<          /"
						+ "\n  \\____S____/");
			}
		}		
	}
}
