import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        String input;
        System.out.println("Please enter a drink: ");
        try (Scanner scanner = new Scanner(System.in)) {
            input = scanner.next();
        }
        System.out.println("Here is your " + input);
    }
}
