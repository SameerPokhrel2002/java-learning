public class ContinueStatement {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                num++; // increment before continuing
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
