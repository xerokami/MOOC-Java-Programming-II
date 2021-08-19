import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {
    private List<T> hideout;

    public Hideout() {
        this.hideout = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (isInHideout()) {
            takeFromHideout();
        }
        hideout.add(toHide);
    }

    public T takeFromHideout() {
        T taken = hideout.get(0);
        hideout.remove(0);
        return taken;
    }

    public boolean isInHideout() {
        return !(hideout.isEmpty());
    }

}
