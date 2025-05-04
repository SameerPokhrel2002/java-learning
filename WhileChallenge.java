public class WhileChallenge {
    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        while (num <= 20) {
            if (isEvenNumber(num)) {
                count++;
                System.out.println(num);
            }
            num++;
            if (count == 5) {
                break;
            }
        }
        System.out.println("Total number of even numbers: " + count);
    }

    public static boolean isEvenNumber(int num) {
        boolean isEven = false;
        if (num % 2 == 0) {
            isEven = true;
        }
        return isEven;
    }
}
