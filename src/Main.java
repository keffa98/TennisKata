import head.Interface;
import sprint1.ClassGame;

import java.util.Scanner;


public class Main extends ClassGame {


    public Main(Interface userInterfarce, String player1, String player2) {
        super(userInterfarce, player1, player2);
    }

    public static void main(String[] args) {

        Interface userInterfarce = new Interface();

        userInterfarce.Welcome();

        System.out.println("Payer1");
        String Player1 = new Scanner(System.in).nextLine();
        System.out.println("Player2");
        String Player2 = new Scanner(System.in).nextLine();

        ClassGame game = new ClassGame( userInterfarce , Player1, Player2);

        game.GameStart();


    }
}
