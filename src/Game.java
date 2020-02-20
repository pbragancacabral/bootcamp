import java.util.Random;

public class Game {
	Prompt prompt;
	int theRandomNumber;
	int numberOfChances;
	int tries;
	int guess;
	
	Game(Prompt prompt, int numberOfChances) {
		this.prompt = prompt;
		this.theRandomNumber = new Random().nextInt(100) + 1;
		this.numberOfChances = numberOfChances;
	}
	
	void play() {
		while (tries < numberOfChances && guess != theRandomNumber) {
			guess = prompt.forNumber();
			tries++;
			if (guess < 1 && guess > 100) {
				prompt.displayErrorMessageForNumberOutOfRange();
			} else if (guess < theRandomNumber) {
				prompt.displayHintForHigherNumber();
			} else if (guess > theRandomNumber) {
				prompt.displayHintForLowerNumber();
			}
		}
		if (guess == theRandomNumber) {
			prompt.displayWinMessage();
		} else {
			prompt.displayLoseMessage(theRandomNumber);
		}
	}
}