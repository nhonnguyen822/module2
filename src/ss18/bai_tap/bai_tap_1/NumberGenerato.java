package ss18.bai_tap.bai_tap_1;

public class NumberGenerato implements Runnable {
    private Thread thread;
    private final String threadName;
    private int priority;

    public NumberGenerato(String threadName, int priority) {
        this.threadName = threadName;
        this.priority = priority;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread " + threadName + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void start() {
        System.out.println("starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.setPriority(priority);
            thread.start();
        }
    }
}
