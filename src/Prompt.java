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

	public void displayHintForLowerNumber() {
		System.out.println("Please pick a lower number");
		
	}

	public void displayHintForHigherNumber() {
		System.out.println("Please pick a higher number");
	}

	public void displayErrorMessageForNumberOutOfRange() {
		System.out.println("Your guess is not between 1 and 100, please try again");
	}
}