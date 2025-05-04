public class WhileLoop {
    public static void main(String[] args) {
        int num = 1;
        while (true) {
            System.out.println(num);
            num++;
            if (num == 6) {
                break;
            }
        }
    }
}
