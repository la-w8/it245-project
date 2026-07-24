import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityScheduler {

    public static void priorityScheduling(PriorityQueue<Task> pQueue) {

        System.out.println("===== Priority Queue Scheduling =====");

        int currentTime = 0;

        while (!pQueue.isEmpty()) {

            Task currentTask = pQueue.poll();

            if (currentTime < currentTask.arrivalTime) {
                currentTime = currentTask.arrivalTime;
            }

            System.out.println("----------------------------");
            System.out.println("Task ID      : " + currentTask.taskId);
            System.out.println("Task Name    : " + currentTask.taskName);
            System.out.println("Priority     : " + currentTask.priority);
            System.out.println("Arrival Time : " + currentTask.arrivalTime);
            System.out.println("Executed At  : " + currentTime);

            currentTime++;
        }

        System.out.println("----------------------------");
        System.out.println("All tasks completed.");
    }
}
