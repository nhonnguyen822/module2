package ss18.thuc_hanh.thuc_hanh_2;

import java.util.Random;

public class Car implements Runnable {
    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    private String name;
    private final int DISTANCE;


    public Car(String name, int DISTANCE) {
        this.name = name;
        this.DISTANCE = DISTANCE;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            int speed = (new Random()).nextInt(20);
            runDistance += speed;
            String log = "|";
            int percentTravel = (runDistance * 100) / DISTANCE;
            
        }
    }
}
