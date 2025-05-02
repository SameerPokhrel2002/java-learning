public class Methods {
    public static void main(String[] args) {
        calculateScore(true,800,5,100); //invoking the method 
        calculateScore(true, 40, 7, 700);
        
    }
    //in java, unlike other programming languages like c#, a method can't be defined inside another method like in main method
    public static void calculateScore(boolean gameOver, int score,int levelCompleted, int bonus){
      
        int finalScore=score;

        if(gameOver){
            finalScore+=(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Your final score was "+ finalScore);
        }

        
    }
    }


   