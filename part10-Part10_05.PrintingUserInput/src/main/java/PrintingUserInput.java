
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userInputs = new ArrayList<>();

        while(true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("")) {
                break;
            }

            userInputs.add(userInput);
        }

        userInputs.forEach(input -> System.out.println(input));
    }
}
