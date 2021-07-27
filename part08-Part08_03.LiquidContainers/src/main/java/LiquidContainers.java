
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String userCommand = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch(userCommand) {
                case "add":
                    //Check for negative amount
                    if (amount < 0) {
                        continue;
                    }
                    firstContainer += amount;

                    //Check if container is over capacity
                    if (firstContainer > 100) {
                        firstContainer = 100;
                    }
                    break;
                case "move":
                    //Check for negative amount
                    if (amount < 0) {
                        continue;
                    }

                    if (amount > firstContainer) {
                        secondContainer += firstContainer;
                        firstContainer = 0;
                    } else if (amount <= firstContainer) {
                        firstContainer -= amount;
                        secondContainer += amount;
                    }

                    //Check if container is over capacity
                    if (secondContainer > 100) {
                        secondContainer = 100;
                    }
                    break;
                case "remove":
                    //Check for negative amount
                    if (amount < 0) {
                        continue;
                    }
                    secondContainer -= amount;

                    //Check if container is under capacity
                    if (secondContainer < 0) {
                        secondContainer = 0;
                    }
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
