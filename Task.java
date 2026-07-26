public class Task implements Comparable<Task> {
    public int taskId;
    public String taskName;
    public int arrivalTime;
    public int priority; // الأولوية (كلما قل الرقم، زادت الأولوية مثلاً)

    // Constructor (دالة البناء)
    public Task(int taskId, String taskName, int arrivalTime, int priority) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.arrivalTime = arrivalTime;
        this.priority = priority;
    }

    // Getters and Setters
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    // مقارنة المهام بناءً على الأولوية لاستخدامها في الـ Priority Queue (يستفيد منه عمر)
    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    // دالة طباعة معلومات المهمة
    @Override
    public String toString() {
        return "Task [ID=" + taskId + ", Name=" + taskName + ", Arrival Time=" + arrivalTime + ", Priority=" + priority + "]";
    }
}
