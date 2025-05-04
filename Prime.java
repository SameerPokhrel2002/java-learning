public class Prime {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + " is " + (isPrime(i) ? "" : "not ") + "a prime number.");
        }
        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
                if (count == 3) {
                    System.out.println("Found 3 prime numbers, exiting out of for loop!");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        if (number == 2)
            return true;
        if (number % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;

    }
}
