import java.util.Random;

public class Game {
	Prompt prompt;
	int theRandomNumber;
	int numberOfChances;
	int tries;
	int guess;
	
	Game(Prompt prompt, int numberOfChances) {
		this.prompt = prompt;
		this.theRandomNumber = new Random().nextInt(3) + 1;
		this.numberOfChances = numberOfChances;
	}
	
	void play() {
		while (tries < numberOfChances && guess != theRandomNumber) {
			guess = prompt.forNumber();
			tries++;
			if (guess < 1 && guess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			}
		}
		if (guess == theRandomNumber) {
			prompt.displayWinMessage();
		} else {
			prompt.displayLoseMessage(theRandomNumber);
		}
	}
}