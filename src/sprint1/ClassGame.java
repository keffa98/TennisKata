package sprint1;


import head.Interface;

public class ClassGame extends ClassScore {

    public  String Player;

    public String Player1;
    public String Player2;
    private Integer[] PlayerScore; // Score
    public int Score;

    public ClassGame(Interface userInterfarce,String player1 , String player2) {
        this.Player1 = player1;
        this.Player2 = player2;
        this.PlayerScore = new Integer[2];
        this.PlayerScore[0] = 0;
        this.PlayerScore[1] = 0;

        userInterfarce.Welcome();


    }
    public void GameStart() {

        System.out.println("Score: " + this.GameScore());
    }

    public String GameScore(){
        return this.Score(PlayerScore[0],PlayerScore[1]);
    }

    public String isWinner(){
         return this.Winner();
    }

}
