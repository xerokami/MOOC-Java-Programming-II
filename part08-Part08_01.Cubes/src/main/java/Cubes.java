
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("end")) {
                break;
            }

            int userNum = Integer.valueOf(userInput);
            cubed(userNum);
        }
    }

    public static void cubed(int number) {
        int numCubed = number * number * number;
        System.out.println(numCubed);
    }
}
