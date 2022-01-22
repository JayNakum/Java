package jay.nakum.Prototype;

// import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		GameStore myStore = new GameStore();
		
//		Scanner in = new Scanner(System.in);
//		String gameName = in.nextLine();
//		in.close();
//		myStore.getGame(gameName).hello();
		
		myStore.getGame("Minecraft").hello();
		myStore.getGame("ForzaHorizon").hello();
		myStore.getGame("CallOfDuty").hello();
		myStore.getGame("Minecraft").hello();
		
	}

}
