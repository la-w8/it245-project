import java.util.Queue;

// Solution 1: Queue Scheduling (FIFO)
// Tasks run in the same order they arrived
public class QueueScheduling {

    public static void queueScheduling(Queue<Task> tasks) {
        System.out.println("Queue Scheduling (FIFO):");

        int time = 0;

        // keep going until the queue is empty
        while (!tasks.isEmpty()) {
            Task t = tasks.poll(); // take the first task out of the queue

            // if the task hasn't arrived yet, wait for it
            if (time < t.arrivalTime) {
                time = t.arrivalTime;
            }

            int start = time;
            int wait = start - t.arrivalTime;
            int finish = start + t.priority;

            System.out.println("----------------------------");
            System.out.println("Task ID      : " + t.taskId);
            System.out.println("Task Name    : " + t.taskName);
            System.out.println("Priority     : " + t.priority);
            System.out.println("Arrival Time : " + t.arrivalTime);
            System.out.println("Start Time   : " + start);
            System.out.println("Finish Time  : " + finish);
            System.out.println("Wait Time    : " + wait);

            time = finish; // move time forward
        }

        System.out.println("----------------------------");
        System.out.println("All tasks completed.");
    }
}
