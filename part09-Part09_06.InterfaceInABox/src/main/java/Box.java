import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> items;
    private double capacity;

    public Box(int maxCapacity) {
        this.items = new ArrayList<>();
        this.capacity = maxCapacity;
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= capacity) {
            items.add(item);
        }
    }

    @Override
    public double weight() {
        double totalCapacity = 0;
        for (Packable item: items) {
            totalCapacity += item.weight();
        }
        return totalCapacity;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
}
