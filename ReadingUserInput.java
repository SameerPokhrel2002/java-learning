import java.time.Year;
import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();
        String userDateOfBirth = "1999";
        int dateOfBirth = Integer.parseInt(userDateOfBirth);

        // parseInt is a static method of the wrapper class Integer

        System.out.println("Age = " + (currentYear - dateOfBirth));

        String userAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
        System.out.println("Age = " + (Year.now().getValue() - ageWithPartialYear));

        // System.out.println(getInputFromConsole(currentYear));

        System.out.println(getInputFromScanner(currentYear));

    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your name?");
        System.out.println("Hi " + name + ", I hope you are having a lovely day!");

        String dateOfBirth = System.console().readLine("What is your year of birth?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old.";

    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        // String name = System.console().readLine("Hi, what's your name?");
        System.out.println("Hi, What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", I hope you are having a lovely day!");
        int age = 0;
        boolean validDOB = false;
        // String dateOfBirth = System.console().readLine("What is your year of
        // birth?");
        do {

            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!! Try again.");
            }
        } while (!validDOB);
        return "So you are " + age + " years old.";

    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }

        return (currentYear - dob);
    }
}
