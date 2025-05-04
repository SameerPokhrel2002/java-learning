public class ForLoop {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double interestRate = 2.0; interestRate <= 10.0; interestRate++) {
            System.out.println(calculateInterest(10000, interestRate));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
