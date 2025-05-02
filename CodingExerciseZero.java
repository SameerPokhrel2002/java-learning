public class CodingExerciseZero {
    public static void main(String[] args) {
        checkNum(0);
        checkNum(5);
        checkNum(-3);
    }
    public static void checkNum(int num)
    {
        String result = "zero";
        if(num > 0)
        {
            result = "positive";
        }
        else if(num < 0)
        {
            result = "negative";
        }
        System.out.println("The number is " + result);
    }
}
