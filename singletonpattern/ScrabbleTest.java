package com.collabera.designpatterns.singletonpattern;

import java.util.LinkedList;

public class ScrabbleTest {
	
	public static void main(String[] args) {
		
		//Instance/Player 1:
		
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Player 1: " + playerOneTiles);
		
		System.out.println(newInstance.getLetterList());
		
		//Instance/Player 2:
		
		Singleton instanceTwo = Singleton.getInstance();
		
		System.out.println("Instance Two ID: " + System.identityHashCode(instanceTwo));

		System.out.println(instanceTwo.getLetterList());
		
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		
		System.out.println("Player 2: " + playerTwoTiles);

	}

}
