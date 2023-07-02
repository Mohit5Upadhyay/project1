import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        System.out.println("Let's play Rock-Paper-Scissors against the computer!");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            String userChoice = getUserChoice(scanner);
            String computerChoice = getComputerChoice(random);

            System.out.println("\nYou chose " + userChoice + ".");
            System.out.println("Computer chose " + computerChoice + ".\n");

            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thank you for playing! Have a great day!");
                break;
            }
        }

        scanner.close();
    }

    public static String getUserChoice(Scanner scanner) {
        String userChoice;
        while (true) {
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            userChoice = scanner.nextLine().toLowerCase();
            if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
                return userChoice;
            }
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public static String getComputerChoice(Random random) {
        int randomChoice = random.nextInt(3);
        switch (randomChoice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            default:
                return "scissors";
        }
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "Congratulations! You win!";
        } else {
            return "Computer wins. Better luck next time!";
        }
    }
}

