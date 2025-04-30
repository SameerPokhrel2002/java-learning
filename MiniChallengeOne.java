public class MiniChallengeOne {
    public static void main(String[] args) {
        double num1=20.00;
        double num2=80.00;
        double num3=(num1+num2)*100.00;
        double rem=num3%40.00;
        boolean isZero=(rem==0.00)?true:false;
        System.out.println(isZero);
        if(isZero!=true)
        {
            System.out.println("got some remainder");
        }
    }
}
