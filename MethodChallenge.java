public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Alice", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(999));
        displayHighScorePosition("Charlie", calculateHighScorePosition(500));
        displayHighScorePosition("Dave", calculateHighScorePosition(100));
        displayHighScorePosition("Eve", calculateHighScorePosition(25));
    }
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position =4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } 
      return position;
    }
}
