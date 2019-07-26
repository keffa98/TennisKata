package sprint2;

import head.Interface;

public class ClassGame extends sprint1.ClassGame {

    public ClassGame(Interface userInterfarce, String player1, String player2) {
        super(userInterfarce, player1, player2);
    }

    public boolean gameWin;
    public static final String gameScores[] = {"1", "2", "3", "4", "5", "6", "7"};
}