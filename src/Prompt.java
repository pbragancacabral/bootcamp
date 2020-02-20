import java.util.Scanner;

public class Prompt {
	int forNumber() {
		System.out.print("Guess a number? ");
		return new Scanner(System.in).nextInt();
	}

	public void displayWinMessage() {
		System.out.println("You win!");
	}

	public void displayLoseMessage(int theRandomNumber) {
		System.out.println("You lose, the number to guess was " + theRandomNumber);
	}
}