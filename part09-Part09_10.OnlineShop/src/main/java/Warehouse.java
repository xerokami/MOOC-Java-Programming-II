import java.util.*;

public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stockBalance;

    public Warehouse() {
        this.products = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        stockBalance.put(product, stock);
    }

    public int price(String product) {
        return products.containsKey(product) ? products.get(product) : -99;
    }

    public int stock(String product) {
        return stockBalance.containsKey(product) ? stockBalance.get(product) : 0;
    }

    public boolean take(String product) {
        if (stockBalance.containsKey(product) && stockBalance.get(product) > 0) {
            stockBalance.put(product, stockBalance.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> uniqueProducts = new HashSet<>();
        for (String product: products.keySet()) {
            if (!uniqueProducts.contains(product)) {
                uniqueProducts.add(product);
            }
        }
        return uniqueProducts;
    }

}
