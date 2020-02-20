import java.util.Scanner;

public class Prompt {
	int forNumber() {
		System.out.print("Guess a number? ");
		return new Scanner(System.in).nextInt();
	}
}