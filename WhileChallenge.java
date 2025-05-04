public class WhileChallenge {
    public static void main(String[] args) {
        int num = 5;
        while (num <= 20) {
            if (isEvenNumber(num)) {
                System.out.println(num);
            }
            num++;
        }
    }

    public static boolean isEvenNumber(int num) {
        boolean isEven = false;
        if (num % 2 == 0) {
            isEven = true;
        }
        return isEven;
    }
}
