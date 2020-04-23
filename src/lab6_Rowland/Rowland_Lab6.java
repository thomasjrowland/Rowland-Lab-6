package lab6_Rowland;

import java.util.Random;
import java.util.Scanner;

public class Rowland_Lab6 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Wellcome to the GC dice game, place your bets!");
		System.out.println();		
		System.out.print("Enter the number of sides for your dice pair: ");
		int userNumSides = scnr.nextInt();
		
		boolean keepGoing = true;
		
		while (keepGoing) {
		
			System.out.print("Ready to roll? (y/n) ");
			String userChoice = scnr.next().toLowerCase();
			
			switch (userChoice) {
			case "y":
				
				int roll1 = roll1(userNumSides);
				int roll2 = roll1(userNumSides);
				
				System.out.println();
				System.out.println("You roll a " + roll1 + " and a " + roll2);
				System.out.println();
				
				rollSlang(roll1, roll2);
				
				System.out.println();
				break;
			
			case "n":
				scnr.close();
				System.out.println();
				System.out.println("Come back when you get some more money!");
				return;
				
			default:
				System.out.println("Please enter y or n");
				break;
			}
			
		}
		
	}

	private static int roll1(int sides1) {
		
		int d1 = (int)(Math.random() * sides1 + 1);
		return d1;
		
	}
	
	private static void rollSlang(int d1, int d2) {
		
		if (d1 == 1 && d2 == 1) {
			System.out.println("SNAKE EYES!");
		} else if (d1 == 6 && d2 == 6) {
			System.out.println("BOX CARS!");
		} else if (d1 + d2 == 7) {
			System.out.println("CRAPS!");
		} else if (d1 == 4 && d2 == 4) {
			System.out.println("HARD EIGHT!");
		} else if (d1 == 2 && d2 == 2) {
			System.out.println("BALLERINAS!");
		} else if (d1 == 3 && d2 == 3) {
			System.out.println("BROOKLYN FOREST!");
		} else if (d1 == 5 && d2 == 5) {
			System.out.println("PUPPY PAWS!");
		} else {
			System.out.println("Total: " + (d1 + d2));
		}
		
	}
}
