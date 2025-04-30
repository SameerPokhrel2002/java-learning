
import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        String result=(num%2==0)?"even":"odd";
        System.out.println("you entered "+num+" which is "+ result);
}
}