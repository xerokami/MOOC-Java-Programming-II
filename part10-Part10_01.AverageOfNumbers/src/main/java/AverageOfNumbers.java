
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> userInputs = new ArrayList<>();

        System.out.println("Input numbers, type end to stop.");

        while(true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("end")) {
                break;
            }

            userInputs.add(userInput);
        }

        double average = userInputs.stream()
                .mapToInt(str -> Integer.valueOf(str))
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + average);
    }
}
