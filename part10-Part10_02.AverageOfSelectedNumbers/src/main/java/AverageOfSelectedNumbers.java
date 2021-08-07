
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> userNums = new ArrayList<>();

        System.out.println("Input numbers, type end to stop.");
        while(true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("end")) {
                break;
            }

            userNums.add(userInput);
        }

        double positiveAverage = userNums.stream()
                .mapToInt(str -> Integer.valueOf(str))
                .filter(num -> num > -1)
                .average()
                .getAsDouble();

        double negativeAverage = userNums.stream()
                .mapToInt(str -> Integer.valueOf(str))
                .filter(num -> num < 0)
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String userChoice = scanner.nextLine();

        if (userChoice.equals("p")) {
            System.out.println("Average of the positive numbers: " + positiveAverage);
        } else if (userChoice.equals("n")) {
            System.out.println("Average of the negative numbers: " + negativeAverage);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
