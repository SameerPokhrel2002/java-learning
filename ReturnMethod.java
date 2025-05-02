public class ReturnMethod {
    public static void main(String[] args) {
        int result=calculateScore(true,800,5,100); //invoking the method
        System.out.println("Your final score was "+ result);
        System.out.println("Your next final score was "+ calculateScore(true,10000,8,200)); //invoking the method
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore=score;
        if(gameOver)
        {
            finalScore+=(levelCompleted*bonus);
            finalScore+=1000;
            
        }
        return finalScore;
    }
}
