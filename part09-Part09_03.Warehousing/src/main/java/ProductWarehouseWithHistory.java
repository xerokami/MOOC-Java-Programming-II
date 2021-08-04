public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);

        super.addToWarehouse(initialBalance);

        changeHistory.add(initialBalance);
    }

    public void addToWarehouse(double amount) {
        double result = 0.0;
        result = (double) super.getBalance() + amount;
        changeHistory.add(result);

        super.addToWarehouse(amount);
    }

    public double takeFromWarehouse(double amount) {
        double result = 0.0;
        result = (double) super.getBalance() - amount;
        changeHistory.add(result);

        return super.takeFromWarehouse(amount);
    }

    public String history() {
        return changeHistory.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
