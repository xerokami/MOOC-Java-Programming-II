
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println(firstContainer);
            System.out.println(secondContainer);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String parts[] = input.split(" ");
            String userCommand = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch(userCommand) {
                case "add":
                    firstContainer.add(amount);
                    break;
                case "move":
                    if (amount > firstContainer.contains()) {
                        secondContainer.add(firstContainer.contains());
                        firstContainer.remove(amount);
                    } else if (amount <= firstContainer.contains()) {
                        secondContainer.add(amount);
                        firstContainer.remove(amount);
                    }
                    break;
                case "remove":
                    secondContainer.remove(amount);
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
