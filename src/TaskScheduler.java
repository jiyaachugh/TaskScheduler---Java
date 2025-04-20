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

        System.out.println("\n=== Round Robin Scheduling ===");
        roundRobinScheduling(new ArrayList<>(taskList), 4);

    }

    public static void priorityScheduling(List<Task> tasks) {
        tasks.sort(Comparator.comparingInt(t -> t.priority));
        int time = 0;
        System.out.println("Priority Scheduling Order:");
        for (Task t : tasks) {
            System.out.printf("Task: %-3s | Start: %2d | End: %2d%n", t.name, time, time + t.burstTime);
            time += t.burstTime;
        }
    }

    public static void roundRobinScheduling(List<Task> tasks, int quantum) {
        Queue<Task> queue = new LinkedList<>(tasks);
        Map<String, Integer> remaining = new HashMap<>();
        for (Task t : tasks) {
            remaining.put(t.name, t.burstTime);
        }

        int time = 0;
        System.out.println("\nRound Robin Scheduling (Quantum = " + quantum + "):");
        while (!queue.isEmpty()) {
            Task current = queue.poll();
            int remainingTime = remaining.get(current.name);

            if (remainingTime > quantum) {
                System.out.printf("Task: %-3s | Start: %2d | End: %2d%n", current.name, time, time + quantum);
                time += quantum;
                remaining.put(current.name, remainingTime - quantum);
                queue.offer(current); // Re-add to queue
            } else {
                System.out.printf("Task: %-3s | Start: %2d | End: %2d%n", current.name, time, time + remainingTime);
                time += remainingTime;
                remaining.remove(current.name);
            }
        }
    }




}
