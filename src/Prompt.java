import java.util.Scanner;

class Prompt {
	int forNumber(int randomNumberUpperBound) {
		System.out.print("Pick a number between 1 and " + randomNumberUpperBound +": ");
		Scanner scanner = new Scanner(System.in);
		return new Scanner(System.in).nextInt();
	}

	void displayWinMessage() {
		System.out.println("You win!");
	}

	void displayLoseMessage(int theRandomNumber) {
		System.out.println("You lose, the number to guess was " + theRandomNumber);
	}

	void displayHintForLowerNumber() {
		System.out.println("Please pick a lower number");
		
	}

	void displayHintForHigherNumber() {
		System.out.println("Please pick a higher number");
	}

	void displayErrorMessageForNumberOutOfRange(int theRandomNumberUpperBound) {
		System.out.println("Your guess is not between 1 and " + theRandomNumberUpperBound + ", please try again");
	}
}