import java.util.Random;

public class Game {
	Prompt prompt;
	int theRandomNumber;
	
	Game(Prompt prompt) {
		this.prompt = prompt;
		this.theRandomNumber = new Random().nextInt(100) + 1;
	}
	
	void play() {
		int guess = prompt.forNumber();
	}
}