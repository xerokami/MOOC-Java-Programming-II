
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        System.out.println("How many random numbers should be printed?");
        int userNum = Integer.valueOf(scanner.nextLine());

        while(userNum != 0) {
            int randomNum = rng.nextInt(11);
            System.out.println(randomNum);
            userNum--;
        }

    }

}
