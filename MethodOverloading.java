public class MethodOverloading {
    public static void main(String[] args) {
       int newScore= calculateScore("Tim", 500); //two arguments
       System.out.println("New score is " + newScore);
       calculateScore(450); //one argument
       calculateScore(); //no arguments
    }

    //method overloading
    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore(int score)
    {
       return calculateScore("Anonymous", score); //calling another method
    }

    public static int calculateScore()
    {
        System.out.println("No player name, no score.");
        return 0;
    }

    //changing the return type of the method does not overload the method
    
    //java uses method overloading to achieve the same effect as defalt parameters in other languages
}
