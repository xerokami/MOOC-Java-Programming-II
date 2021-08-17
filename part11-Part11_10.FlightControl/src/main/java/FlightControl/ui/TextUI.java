package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;

import java.util.Scanner;

public class TextUI {
    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void start() {
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
    }

    public void startAssetControl() {
        boolean looping = true;
        System.out.println("Airport Asset Control");
        System.out.println("---------------------");
        System.out.println();

        while (looping) {
            System.out.println("Choose an option");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.println("> ");
            String answer = scanner.nextLine();

            switch (answer) {
                case "1":
                    addAirplane(scanner);
                    break;
                case "2":
                    addFlight(scanner);
                    break;
                default:
                    looping = false;
                    break;
            }
        }
    }

    public void addAirplane(Scanner scanner) {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        this.flightControl.addAirplane(id, capacity);
    }

    public void addFlight(Scanner scanner) {
        System.out.print("Give the airplane id: ");
        Airplane airplane = askForAirplane(scanner);
        System.out.print("Give the departure airport id: ");
        String departureID = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String destinationID = scanner.nextLine();

        this.flightControl.addFlight(airplane, departureID, destinationID);
    }

    private void startFlightControl() {
        boolean looping = true;
        System.out.println("Flight Control");
        System.out.println("--------------");
        System.out.println();

        while (looping) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String answer = scanner.nextLine();

            switch (answer) {
                case "1":
                    printAirplanes();
                    break;
                case "2":
                    printFlights();
                    break;
                case "3":
                    printAirplaneDetails();
                    break;
                default:
                    looping = false;
                    break;
            }
        }
    }

    private void printAirplanes() {
        for (Airplane plane: flightControl.getAirplanes()) {
            System.out.println(plane);
        }
    }

    private void printFlights() {
        for (Flight flight: flightControl.getFlights()) {
            System.out.println(flight);
            System.out.println("");
        }
    }

    private void printAirplaneDetails() {
        System.out.println("Give the airplane id: ");
        Airplane plane = askForAirplane(scanner);
        System.out.println(plane);
        System.out.println();
    }

    private Airplane askForAirplane(Scanner scanner) {
        Airplane airplane = null;
        while (airplane == null) {
            String id = scanner.nextLine();
            airplane = flightControl.getAirplane(id);

            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return airplane;
    }
}
