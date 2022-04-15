import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CoffeeMachine {
	public static final String DATE = "13/04/2022";
	public static final String WELCOME = "Bitte Karte einlesen...";
	public static final String ZUCKER = "-   ZUCKER    +";
	public static final String PAUSE = "Goennen Sie sich eine Pause.";

	public static List<String> drinks = List.of("Caffè Latte", "Espresso Machiato", "Cappucino", "Chocotraum",
			"Chocogetraenk", "Espresso", "Latte Machiato");

	public static void main(String[] args) throws IOException {
		System.out.println(DATE);
		System.out.println(WELCOME);

		System.out.println(drinks);

		Writer unicodeFileWriter = new OutputStreamWriter(new FileOutputStream("a.txt"), "UTF-8");
		unicodeFileWriter.write("漢字");

		System.out.print("Please enter a drink: ");
//        String input = JOptionPane.showInputDialog(null);
		String input;
		try (Scanner scanner = new Scanner(System.in)) {
			input = scanner.next();
		
		if (input.equals("Caffè Latte") || input.equals("Espresso Machiato") || input.equals("Cappucino")
				|| input.equals("Chocotraum") || input.equals("Latte Machiato")) {
			System.out.println("Do you want milk with your drink?");
			input = scanner.next();
			if (input.equals("yes")) {
				System.out.println("Pouring milk in it.");
			} else if (input.equals("no")) {
				System.out.println("Okay, no milk for today.");
			}
		}
		}
		System.out.println(ZUCKER);
		System.out.println(PAUSE);
		System.out.println("Here is your " + input + ".");
	}
}