
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while(true) {
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;
            }

            numList.add(userNum);
        }
        average(numList);
    }

    public static void average(ArrayList<Integer> numList) {
        int positiveNumCount = 0;
        int sumOfPositiveNums = 0;

        for (int num: numList) {
            if (num > 0) {
                sumOfPositiveNums += num;
                positiveNumCount++;
            }
        }

        double average = 1.0 * sumOfPositiveNums / positiveNumCount;

        if (positiveNumCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }
    }
}
