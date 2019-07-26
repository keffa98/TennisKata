package sprint1;

import java.util.Random;

public class ClassScore {

    public int player1Score = 0; // Score du joueur 1
    public int player2Score = 0; // Score du joueur 2
    public static final String gameScores[] = {"0","15","30","40"};
    public String Player;
    public String Player1Adv;
    public String Player2Adv;
    public  boolean hasAdvantage;


    public Integer StartPoint(){
            return 0;
        }



    public boolean playerWon(int score1 , int score2) {
        return(score1>score2);
    }

    public boolean player1Won() {
        return playerWon(this.player1Score,this.player2Score);
    }

    public boolean player2Won() {
        return playerWon(this.player2Score,this.player1Score);
    }

    public int Player1Score() {
        this.wonPoint();
        return this.player1Score++;
    }

    public int Player2Score() {
        this.wonPoint();
        return this.player2Score++;
    }

    public String wonPoint() {
        return "Player won a point";
    }


    public String Score(Integer player1Score , Integer player2Score) {
        return gameScores[this.player1Score] + "-" + gameScores[this.player2Score];
    }

    private String DeuceandAdvandtge() {

        if(this.Player1Score() == this.Player2Score() && this.player1Won() || this.player2Won()){
            return "DEUCE";
        }
        if(this.Player1Score() > this.Player2Score()){
            this.Player1Adv = this.Player;
            return "Advantage player1";
        }else {
            this.Player2Adv = this.Player;
            return "Advantage player2";
        }

    }

    public String Winner( ) {
        if(this.player1Won()) {
            return "Player1 is the winner";
        }else if(player2Won()) {
            return "Player2 is the winner";
        }

        return "Tie";
    }
    public String Adv() {
        if(this.hasAdvantage){
            this.wonPoint();
        }else{
            return "Adv Lose";
        }
        return this.Player;
    }

    private String getWinnerAdv() {
        this.DeuceandAdvandtge();
        this.Adv();
        return "Player" +this.Player+"is the winner";
    }

    private String losepoint() {
       // this.PlayerScore = 0;
        return "losepoint";
    }

}
