import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        int taskNumber = 1;
        for (String task: tasks) {
            System.out.println(taskNumber + ": " + task);
            taskNumber++;
        }
    }

    public void remove(int number) {
        if (tasks.size() >= number) {
            tasks.remove(number - 1);
        }
    }
}
