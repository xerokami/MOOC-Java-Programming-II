import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int boxCapacity;
    private ArrayList<Item> maxWeightBox;

    public BoxWithMaxWeight(int capacity) {
        this.boxCapacity = capacity;
        this.maxWeightBox = new ArrayList<>();
    }

    public int currentCapacity() {
        int sum = 0;

        for (Item item: maxWeightBox) {
            sum += item.getWeight();
        }

        return sum;
    }

    @Override
    public void add(Item item) {
        if (currentCapacity() + item.getWeight() <= boxCapacity) {
            maxWeightBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return maxWeightBox.contains(item);
    }

}
