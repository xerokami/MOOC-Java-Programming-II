
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userInputs = new ArrayList<>();

        while(true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput < 0) {
                break;
            }

            userInputs.add(userInput);
        }

        userInputs.stream()
                .filter(num -> num > 0 && num < 6)
                .forEach(num -> System.out.println(num));
    }
}
