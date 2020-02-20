public class Application {
	public static void main(String[] args) {
		Prompt prompt = new Prompt();
		Game game = new Game(prompt);
		game.play();
	}
}