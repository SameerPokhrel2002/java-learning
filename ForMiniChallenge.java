public class ForMiniChallenge {
    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            System.out.println(calculateInterest(100, rate));
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100.0));
    }
}
