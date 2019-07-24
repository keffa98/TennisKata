package sprint1.userStory1;



public class ClassGame implements ClassScore {

    public  String Player;

    public String PlayerScore;
    private int player1Score; // Score du joueur 1

    private int player2Score; // Score du joueur 2

    public int Score;

    public static final String gameScores[] = {"0","15","30","40"};

    public ClassGame() {
        this.player1Score = 0;
        this.player2Score = 0;




        this.Winner();

    }

    private boolean playerWon(int score1 , int score2) {
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


    @Override
    public String wonPoint() {
            return "Player won a point";
    }

    public String Winner( ) {
        if(this.player1Won()) {
             return "Player1 is the winner";
        }else if(player2Won()) {
            return "Player2 is the winner";
        }

        return "Tie";
    }

    @Override
    public String Score() {
        return gameScores[this.player1Score] + "-" + gameScores[this.player2Score];
    }
}
