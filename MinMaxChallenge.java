import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        boolean keepRunning = true;
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        while (keepRunning) {
            System.out.print("Enter a number or a character (q) to quit: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int num = Integer.parseInt(userInput);
                if (num < minNumber) {
                    minNumber = num;
                }
                if (num > maxNumber) {
                    maxNumber = num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a valid integer or 'q' to quit.");
            }
        }

        if (minNumber != Integer.MAX_VALUE && maxNumber != Integer.MIN_VALUE) {
            System.out.println("Minimum Number = " + minNumber);
            System.out.println("Maximum Number = " + maxNumber);
        } else {
            System.out.println("No valid numbers were entered.");
        }
    }
}
