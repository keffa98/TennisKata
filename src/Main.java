import sprint1.ClassGame;

import java.util.Scanner;


public class Main extends ClassGame {

    public Main(String player1, String player2) {
        super(player1, player2);
    }

    public static void main(String[] args) {

        Interface userInterfarce = new Interface();

        userInterfarce.Welcome();

        System.out.println("Payer1");
        String player1 = new Scanner(System.in).nextLine();
        System.out.println("Player2");
        String player2 = new Scanner(System.in).nextLine();

        ClassGame game = new ClassGame( player1, player2);



    }
}
