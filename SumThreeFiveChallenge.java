public class SumThreeFiveChallenge {
    public static void main(String[] args) {
        int sum = 0, count = 0;

        for (int num = 1; num <= 1000; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num);
                count++;
                sum += num;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("The sum of above numbers: " + sum);
    }
}
