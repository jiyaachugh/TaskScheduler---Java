import java.util.*;

public class TaskScheduler {

    static class Task {
        String name;
        int burstTime;
        int priority;

        public Task(String name, int burstTime, int priority) {
            this.name = name;
            this.burstTime = burstTime;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        List<Task> taskList = Arrays.asList(
                new Task("T1", 10, 2),
                new Task("T2", 5, 1),
                new Task("T3", 8, 3)
        );

        System.out.println("=== Priority Scheduling ===");
        priorityScheduling(new ArrayList<>(taskList));

    }

    public static void priorityScheduling(List<Task> tasks) {
        tasks.sort(Comparator.comparingInt(t -> t.priority));
        int time = 0;
        System.out.println("Priority Scheduling Order:");
        for (Task t : tasks) {
            System.out.println("Task: " + t.name + ", Start: " + time + ", End: " + (time + t.burstTime));
            time += t.burstTime;
        }
    }

}
