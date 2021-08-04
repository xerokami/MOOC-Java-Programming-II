import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        herd.forEach(member -> member.move(dx, dy));
    }

    @Override
    public String toString() {
        String members = "";
        for (Movable member: herd) {
            members += member.toString() + "\n";
        }
        return members;
    }
}
