import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageFacility;

    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> items = this.storageFacility.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageFacility.containsKey(storageUnit) ? this.storageFacility.get(storageUnit) : new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        this.storageFacility.get(storageUnit).remove(item);

        if (this.storageFacility.get(storageUnit).isEmpty()) {
            this.storageFacility.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();

        for (String storageUnit: this.storageFacility.keySet()) {
            if (!(this.storageFacility.get(storageUnit).isEmpty())) {
                storageUnits.add(storageUnit);
            }
        }

        return storageUnits;
    }

}
