import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            //Generating a randomizer for the machine input in response of the player
            String playerMove;

            while (true) {
                System.out.println("Please enter your move (r, p, or s) ");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove = "is not a valid move.");
                // generating the response for the player input in a loop for to make sure player only inputs r,p or s
            }
            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
                //response if the game is a tie
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You lose!");
                    //response if player uses rock

                } else if (computerMove.equals("s")) {
                    System.out.println("You win!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("You win!");
                    //response if player uses paper

                } else if (computerMove.equals("s")) {
                    System.out.println("You lose!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    System.out.println("You win!");

                } else if (computerMove.equals("r")) {
                    System.out.println("You lose!");
                    //response if player uses scissors
                }
            }
            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {
                break;
                //loop to restart the game after the response
            }

            scanner.close();
        }
    }
}