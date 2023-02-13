package com.aurionpro.test;

import com.aurionpro.model.Player;

public class PlayerTest {
	public static void main(String[] args) {

		Player[] player = { new Player("amogh", 21, "India"),
				new Player("prathamesh", 22, "France"),
				new Player("Akshay", 25, "russia") };

		Player elderPlayer = Player.elderPlayer(player);

		System.out.println("elder layer is:"+elderPlayer);

	}
}
