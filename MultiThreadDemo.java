class Task extends Thread {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " running step " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted");
            }
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {

        Task t1 = new Task("Thread-1");
        Task t2 = new Task("Thread-2");
        Task t3 = new Task("Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
