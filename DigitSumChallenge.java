public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of digits of number is: " + sumDigit(-10));
    }

    public static int sumDigit(int number) {
        int result = 0;
        if (number > 0) {

            while (number != 0) {
                int rem = number % 10;
                result += rem;
                number /= 10;
            }

        } else {
            return -1;
        }
        return result;
    }
}
