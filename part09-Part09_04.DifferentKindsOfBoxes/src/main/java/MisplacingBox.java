import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> misplacingBoxItems;

    public MisplacingBox() {
        this.misplacingBoxItems = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        misplacingBoxItems.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
