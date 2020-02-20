import java.util.Random;

class Game {
	Prompt prompt;
	int randomNumber;
	int randomNumberUpperBound;
	int maxTries;
	int currentTries;
	int guess;

	Game(Prompt prompt, int randomNumberUpperBound, int maxTries) {
		this.prompt = prompt;
		this.randomNumberUpperBound = randomNumberUpperBound;
		this.randomNumber = new Random().nextInt(randomNumberUpperBound) + 1;
		this.maxTries = maxTries;
	}

	void play() {
		while (areTriesLeftAndGameIsNotWon()) {
			promptForGuess();
			displayHint();
		}
		displayOutcome();
	}

	boolean areTriesLeftAndGameIsNotWon() {
		return areTriesLeft() && !gameIsWon();
	}
	
	boolean areTriesLeft() {
		return currentTries < maxTries;
	}
	
	boolean gameIsWon() {
		return guess == randomNumber;
	}
	
	void promptForGuess() {
		guess = prompt.forNumber(randomNumberUpperBound);
		if (isGuessOutOfBounds()) {
			prompt.displayErrorMessageForNumberOutOfRange(randomNumberUpperBound);
			return;
		}
		currentTries++;
	}

	boolean isGuessOutOfBounds() {
		return guess < 1 || guess > randomNumberUpperBound;
	}

	void displayHint() {
		if (guess < randomNumber)
			prompt.displayHintForHigherNumber();
		else if (guess > randomNumber)
			prompt.displayHintForLowerNumber();
	}

	void displayOutcome() {
		if (gameIsWon())
			prompt.displayWinMessage();
		else
			prompt.displayLoseMessage(randomNumber);
	}
}