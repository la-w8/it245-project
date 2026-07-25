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
                int finish = start + t.burstTime;

                System.out.println(t + " -> start: " + start + ", finish: " + finish + ", wait: " + wait);

                time = finish; // move time forward
            }
        }
    }
