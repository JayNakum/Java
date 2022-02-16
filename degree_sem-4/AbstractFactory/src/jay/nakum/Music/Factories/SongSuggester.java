package jay.nakum.Music.Factories;

import java.util.Random;
import java.util.Scanner;

import jay.nakum.Music.Difficulty;

public class SongSuggester {
	
	private Difficulty getDifficulty() {
		Scanner in = new Scanner(System.in);
		System.out.println("Select Difficulty: ");
		System.out.println("0. Easy\n"
				+ "1. Intermediate\n"
				+ "2. Expert\n"
				+ "3. Any\n");
		System.out.print("Enter Choice: ");
		int choice = in.nextInt();
		in.close();
		if(choice == 3) {
			choice = new Random().nextInt(3);
		}
		switch (choice) {
		case 0: 
			return Difficulty.Easy;
		case 1:
			return Difficulty.Intermediate;
		case 2:
			return Difficulty.Expert;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
	}
	
	public GenreFactory suggest() {
		Difficulty difficulty = getDifficulty();
		switch (difficulty) {
		case Easy:
			return new BluesFactory();
		case Intermediate:
			return new RockFactory();
		case Expert:
			return new MetalFactory();
		default:
			throw new IllegalArgumentException("Unexpected value: " + difficulty);
		}
	}
}
