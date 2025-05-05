package ss18.thuc_hanh.thuc_hanh_1;

public class RunnableDemo implements Runnable {
    private Thread thread;
    private final String threadName;

    @Override
    public void run() {
        System.out.println("running :" + threadName);
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread " + threadName + "," + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread " + threadName + "exiting .");
    }

    public RunnableDemo(String name) {
        this.threadName = name;
        System.out.println("creating " + threadName);
    }

    public void star() {
        System.out.println("starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
