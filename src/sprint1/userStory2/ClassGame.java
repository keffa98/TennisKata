package sprint1.userStory2;

public class ClassGame extends sprint1.userStory1.ClassGame {

    public String Player1Adv;
    public String Player2Adv;

    public int PlayerScore;

    public  boolean hasAdvantage;



    public int score() {
        

        return this.Score;
    }

    public String Adv() {
        if(this.hasAdvantage){
            this.wonPoint();
        }else{
            return "Adv Lose";
        }
        return this.Player;
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

    private String getWinnerAdv() {
        this.DeuceandAdvandtge();
        this.Adv();
        return "Player" +this.Player+"is the winner";
    }

    private String losepoint() {
        this.PlayerScore = 0;
        return "losepoint";
    }




}
