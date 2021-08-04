import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChangeHistory {
    private List<Double> historyList;

    public ChangeHistory() {
        this.historyList = new ArrayList<>();
    }

    public void add(double status) {
        historyList.add(status);
    }

    public void clear() {
        historyList.clear();
    }

    public double maxValue() {
        return historyList.isEmpty() ? 0.0 : Collections.max(historyList);
    }

    public double minValue() {
        return historyList.isEmpty() ? 0.0 : Collections.min(historyList);
    }

    public double average() {
        if (historyList.isEmpty()) {
            return 0.0;
        } else {
            double sum = 0.0;

            for (Double element: historyList) {
                sum += element;
            }

            double average = sum / historyList.size();
            return average;
        }
    }

    @Override
    public String toString() {
        return historyList.toString();
    }
}
