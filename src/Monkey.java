// *******************************************************************************************************************
// Monkey.java
// Design and implement a class called Monkey, which represents a monkey climbing along a vertical vine in the
// jungle. The monkey can only climb for one unit of distance at a time. The direction in which it is climbing can
// be either up or down. The monkey can decide to change direction (i.e., if it was climbing up, then it will now
// be climbing down; and vice-versa). Monkey requires a toString method to return both the current position and the
// direction climbing to the driver, so it can be output. No set or get methods are required for this question.
//
// Hints: Remember that a vertical number line has a zero position in the middle with positive to the top and
// negative to the bottom. It is your design choice whether the monkey will jump onto the vine in the middle or
// at some random point between two limits.
//
// Write an interactive test driver that instantiates a Monkey, then allows the user to manipulate it with simple
// commands like Output (to see the position and direction), Climb, Reverse, Exit ... single letters work just fine.
// All output must be via the driver not methods within Monkey. You should use this driver to create screenshot
// exhibits for a number of scenarios (e.g. output original state, climb a few times, output, climb a few more
// times, output, reverse, output, climb, output, reverse, output, etc.).
// *******************************************************************************************************************
import java.util.Scanner;

public class Monkey
{
    public static void main(String[] args)
    {
        // Instantiates the object and gives instructions to user, takes user input for interactive test driver
        MonkeyObject monkey = new MonkeyObject();
        Scanner scan = new Scanner(System.in);
        System.out.println("Monkey Climber. We have a monkey called \"Sid\" he is able to move up, down and show his" +
                " position. \nPress \"U\" for up, \"D\" for down, \"R\" for reverse direction, \"P\" for position and" +
                " direction faced. \"Q\" for quit");
        // Loop for repeatedly taking user input, with a quit option to break out of loop and quit game
        while (true)
        {
            System.out.print("Enter your choice (\"I\" for instructions): ");
            String userInput = scan.nextLine();
            // Moves monkey up one or down one depending on user input, error message for monkey not facing correct way
            if (userInput.equalsIgnoreCase("U"))
            {
                if (monkey.monkeyState())
                {
                    System.out.println("Climbing up");
                    monkey.movingUp();
                }
                else
                {
                    System.out.println("Can't move in this direction, change direction of monkey!");
                }
            }
            if (userInput.equalsIgnoreCase("D"))
            {
                if (!monkey.monkeyState())
                {
                    System.out.println("Climbing down");
                    monkey.movingDown();
                }
                else
                {
                    System.out.println("Can't move in this direction, change direction of monkey!");
                }
            }
            // Allows user to reverse facing direction of monkey, and a toString call to print position/direction faced
            if (userInput.equalsIgnoreCase("R"))
            {
                System.out.println("Direction reversed: " + monkey.reverse());
            }

            if (userInput.equalsIgnoreCase("P"))
            {
                System.out.println("Current position: " + monkey.positionToString() + ", Direction faced: " +
                        monkey.directionToString());
            }
            // Input options for exit and also an information menu, in case user needs reminder of accepted inputs
            if (userInput.equalsIgnoreCase("Q"))
            {
                System.out.println("Exiting Monkey Climber!");
                break;
            }
            if (userInput.equalsIgnoreCase("I"))
            {
                System.out.println("\"U\" for up\n\"D\" for down\n\"R\" for reverse direction\n\"P\" for position and" +
                        " direction faced\n\"Q\" for quit");
            }
        }
    }
}