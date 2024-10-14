import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            String playerA = playerMove(scanner, "Player A");

            String playerB = playerMove(scanner, "Player B");

            decideWinner(playerA, playerB);

            playAgain = playAnotherRound(scanner);
        }

        System.out.println("Thanks for playing!");
    }

    public static String playerMove(Scanner scanner, String player) {
        String move;
        while (true) {
            System.out.println(player + ", enter your move (R/P/S or r/p/s)?: ");
            move = scanner.nextLine().toUpperCase();
            if (move.equals("R") || move.equals("P") || move.equals("S")) {
                break;
            }
            System.out.println("This is an invalid move! Please enter either R, P, or S.");
        }
        return move;
    }
    public static void decideWinner(String playerA, String playerB) {
        if (playerA.equals(playerB)) {
            System.out.println(playerA + " vs " + playerB + ": It's a tie!");
        } else if (playerA.equals("R") && playerB.equals("S")) {
            System.out.println("Rock breaks Scissors. Player A is the winner!");
        } else if (playerA.equals("P") && playerB.equals("R")) {
            System.out.println("Paper covers Rock. Player A is the winner!");
        } else if (playerA.equals("S") && playerB.equals("P")) {
            System.out.println("Scissors cuts Paper. Player A is the winner!");
        } else if (playerB.equals("R") && playerA.equals("S")) {
            System.out.println("Rock breaks Scissors. Player B is the winner!");
        } else if (playerB.equals("P") && playerA.equals("R")) {
            System.out.println("Paper covers Rock. Player B is the winner!");
        } else if (playerB.equals("S") && playerA.equals("P")) {
            System.out.println("Scissors cuts Paper. Player B is the winnner!");
        }
    }

    public static boolean playAnotherRound(Scanner scanner) {
        System.out.println("Do you want to play another round? [Y/N]");
        String choice = scanner.nextLine().toUpperCase();
        return choice.equals("Y");
    }
}
