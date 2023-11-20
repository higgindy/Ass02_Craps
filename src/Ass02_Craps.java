import java.util.Random;
import java.util.Scanner;

public class Ass02_Craps
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain)
        {
            System.out.println("Let's play Craps!");
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int initialSum = die1 + die2;

            System.out.println("Initial roll: " + initialSum);

            if (initialSum == 2 || initialSum == 3 || initialSum == 12)
            {
                System.out.println("You crapped out! You lose!");
            }
            else if (initialSum == 7 || initialSum == 11)
            {
                System.out.println("You got a natural! You win!");
            }
            else
            {
                int point = initialSum;
                System.out.println("The point is now: " + point);
                System.out.println("Trying for point.");

                boolean gameWon = false;
                while (true)
                {
                    die1 = random.nextInt(6) + 1;
                    die2 = random.nextInt(6) + 1;
                    int roll = die1 + die2;
                    System.out.println("Roll: " + roll);

                    if (roll == point)
                    {
                        System.out.println("Made point and won!");
                        gameWon = true;
                        break;
                    }
                    else if (roll == 7)
                    {
                        System.out.println("Got a seven and lost!");
                        break;
                    }
                }

                if (gameWon)
                {
                    System.out.println("You won!");
                }
                else
                {
                    System.out.println("You lost!");
                }
            }

            System.out.println("Do you want to play again? (Y/N)");
            String playChoice = scanner.nextLine().toUpperCase();
            playAgain = playChoice.equals("Y");
        }

    }
}



