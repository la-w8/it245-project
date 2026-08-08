import java.util.PriorityQueue;

public class PriorityScheduler {

    public static void priorityScheduling(PriorityQueue<Task> pQueue) {

         System.out.println("===== Priority Queue Scheduling =====");

        int currentTime = 0;

        while (!pQueue.isEmpty()) {

            Task currentTask = pQueue.poll();

if (currentTime < currentTask.arrivalTime) {
    currentTime = currentTask.arrivalTime;
}

int start = currentTime;
int wait = start - currentTask.arrivalTime;
int finish = start + currentTask.priority;

System.out.println("----------------------------");
System.out.println("Task ID      : " + currentTask.taskId);
System.out.println("Task Name    : " + currentTask.taskName);
System.out.println("Priority     : " + currentTask.priority);
System.out.println("Arrival Time : " + currentTask.arrivalTime);
System.out.println("Start Time   : " + start); 
System.out.println("Finish Time  : " + finish);
System.out.println("Wait Time    : " + wait);

currentTime = finish;
        }

        System.out.println("----------------------------");
        System.out.println("All tasks completed.");
    }
}
