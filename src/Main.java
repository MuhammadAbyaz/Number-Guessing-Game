import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(100);
        System.out.println("You have ten tries to guess the number.");
        System.out.print("Press enter to start!");
        scanner.nextLine();
        System.out.println(randomNumber);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Guess the number: ");
            int userInput = scanner.nextInt();
            if (userInput == randomNumber) {
                System.out.println("Hurray! You win.");
                break;
            } else if (userInput <= randomNumber + 5 && userInput >= randomNumber - 5) {
                System.out.println("You are so close to the number");
            } else if (userInput <= randomNumber + 10 && userInput >= randomNumber - 10) {
                System.out.println("You are close to the number.");
            } else if (userInput <= randomNumber + 15) {
                System.out.println("Decrease the number.");
            } else if (userInput >= randomNumber - 15) {
                System.out.println("Increase the number.");
            } else {
                System.out.println("You are so far from the number.");
            }
        }

    }
}