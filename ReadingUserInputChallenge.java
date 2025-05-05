import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (count < 5) {
            System.out.println("Enter number #" + (count + 1) + ":");
            String input = scanner.nextLine();

            if (isValidInteger(input)) {
                int number = Integer.parseInt(input);
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
        }

        System.out.println("Sum of the numbers: " + sum);
    }

    public static boolean isValidInteger(String userInput) {
        try {
            Integer.parseInt(userInput);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
