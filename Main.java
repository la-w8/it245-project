import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   Task Scheduling System - Test Suite    ");
        System.out.println("==========================================");

        // [1] Setup Test Cases 
        System.out.println("\n[+] Initializing test tasks...");
        
        Task t1 = new Task(1, "Database Backup", 0, 3);
        Task t2 = new Task(2, "Critical Security Patch", 1, 1);
        Task t3 = new Task(3, "Generate Report", 2, 2);
        
        // [2] Test FIFO Queue Scheduling 
        System.out.println("\n[+] Testing FIFO Queue Scheduling ...");
       
        Queue<Task> tasksQueue = new LinkedList<>();
        tasksQueue.add(t1);
        tasksQueue.add(t2);
        tasksQueue.add(t3);
        
        QueueScheduling.queueScheduling(tasksQueue);

        // [3] Test Priority Queue Scheduling
        System.out.println("\n[+] Testing Priority Queue Scheduling ...");
        // priorityScheduling(priorityQueue);

        System.out.println("\n==========================================");
        System.out.println("       Test Execution Completed!           ");
        System.out.println("==========================================");
    }
}
