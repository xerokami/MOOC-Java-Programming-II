
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(-100);
        nums.add(50);
        nums.add(9);
        nums.add(0);

        System.out.println(positive(nums));
        System.out.println(positiveAlternative(nums));


    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num > -1)
                .collect(Collectors.toList());
    }

    public static List<Integer> positiveAlternative(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num > -1)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
