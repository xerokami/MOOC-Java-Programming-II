import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegister;

    public VehicleRegistry() {
        this.vehicleRegister = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        for (LicensePlate lP: vehicleRegister.keySet()) {
            if (lP.equals(licensePlate)) {
                return false;
            }
        }
        vehicleRegister.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return vehicleRegister.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (vehicleRegister.containsKey(licensePlate)) {
            vehicleRegister.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate lP: vehicleRegister.keySet()) {
            System.out.println(lP);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String owner: vehicleRegister.values()) {
            if (!(owners.contains(owner))) {
                owners.add(owner);
            }
        }

        for (String owner: owners) {
            System.out.println(owner);
        }
    }
}
