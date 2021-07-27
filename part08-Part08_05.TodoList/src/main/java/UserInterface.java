import java.util.Scanner;

public class UserInterface {
    private TodoList taskList;
    private Scanner scanner;

    public UserInterface(TodoList taskList, Scanner scanner) {
        this.taskList = taskList;
        this.scanner = scanner;
    }

    public void start() {
        boolean looping = true;

        while(looping) {
            System.out.print("Command: ");
            String userCommand = scanner.nextLine();

            switch(userCommand) {
                case "add":
                    System.out.print("To add: ");
                    String taskToAdd = scanner.nextLine();

                    taskList.add(taskToAdd);
                    break;
                case "list":
                    taskList.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int taskToRemove = Integer.valueOf(scanner.nextLine());

                    taskList.remove(taskToRemove);
                    break;
                case "stop":
                    looping = false;
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
