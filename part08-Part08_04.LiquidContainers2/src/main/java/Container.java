public class Container {
    private int containerAmount;

    public Container() {
        this.containerAmount = 0;
    }

    public int contains() {
        return this.containerAmount;
    }

    public void add(int amount) {
        if (!(amount < 0)) {
            containerAmount += amount;
            if (containerAmount > 100) {
                containerAmount = 100;
            }
        }
    }

    public void remove(int amount) {
        if (!(amount < 0)) {
            containerAmount -= amount;
            if (containerAmount < 0) {
                containerAmount = 0;
            }
        }
    }

    @Override
    public String toString() {
        return this.containerAmount + "/100";
    }
}
