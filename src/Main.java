import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Declare Variables
        Scanner in = new Scanner(System.in);
        String choiceA;
        String choiceB;
        String playAgain = "y";


        //While Statement for playing again

        while (playAgain.equalsIgnoreCase("y")) {
            {
                //Get Player A input
                System.out.print("Player A: Choose R, P or S: ");
                choiceA = in.nextLine();
                //Check for correct input
                while(!choiceA.equals("R") && !choiceA.equals("P") && !choiceA.equals("S"))
                {
                    System.out.print("Incorrect Input, Player A: Choose R, P or S: ");
                    choiceA = in.nextLine();
                }

                //Get Player B input
                System.out.print("Player B: Choose R, P or S: ");
                choiceB = in.nextLine();

                //Check for correct input
                while(!choiceB.equals("R") && !choiceB.equals("P") && !choiceB.equals("S"))
                {
                    System.out.print("Incorrect Input, Player B: Choose R, P or S: ");
                    choiceB = in.nextLine();
                }

                System.out.println();

                //Output user choices
                System.out.println("Player A chose: " + choiceA);
                System.out.println("Player B chose: " + choiceB);
                System.out.println();

                //Determine Winner
                if (choiceA.equalsIgnoreCase("R")) {
                    if (choiceB.equalsIgnoreCase("S")) {
                        System.out.println("Rock beats Scissors, Player A wins!");
                    } else if (choiceB.equalsIgnoreCase("P")) {
                        System.out.println("Paper covers Rock, Player B wins!");
                    } else if (choiceB.equalsIgnoreCase("R")) {
                        System.out.println("You both chose Rock, it's a tie!");
                    }

                }
                if (choiceA.equalsIgnoreCase("S")) {
                    if (choiceB.equalsIgnoreCase("P")) {
                        System.out.println("Scissors cut Paper, Player A wins!");
                    } else if (choiceB.equalsIgnoreCase("R")) {
                        System.out.println("Rock beats Scissors, Player B wins!");
                    } else if (choiceB.equalsIgnoreCase("S")) {
                        System.out.println("You both chose Scissors, it's a tie!");
                    }

                }
                if (choiceA.equalsIgnoreCase("P")) {
                    if (choiceB.equalsIgnoreCase("R")) {
                        System.out.println("Paper covers Rock, Player A wins!");
                    } else if (choiceB.equalsIgnoreCase("S")) {
                        System.out.println("Scissors cut Paper, Player B wins!");
                    } else if (choiceB.equalsIgnoreCase("P")) {
                        System.out.println("You both chose Paper, it's a tie!");
                    }

                }

                //Determine if player wants to play again
                System.out.println();
                System.out.print("Would you like to play again? Please enter Y or N: ");

                playAgain = in.nextLine();

                //Check for correct input
                while(!playAgain.equals("Y") && !playAgain.equals("N"))
                {
                    System.out.print("Error, please enter Y or N: ");
                    playAgain = in.nextLine();
                }

                System.out.println();
            }
        }
        System.out.println("Thank you for playing!");
    }
}
