
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Initialize random
        Random rand = new Random();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        while (numbers.size() != 7) {
            int randomNum = rand.nextInt(40) + 1;
            if (!(containsNumber(randomNum))) {
                numbers.add(randomNum);
            }
        }
        Collections.sort(numbers);
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return numbers.contains(number);
    }
}

