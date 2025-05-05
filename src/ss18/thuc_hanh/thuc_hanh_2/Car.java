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
    private final int DISTANCE = 100;
    private final int STEP = 5;


    public Car(String name) {
        this.name = name;

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
            for (int i = 0; i < DISTANCE; i += STEP) {
                if (percentTravel >= i + STEP) {
                    log += "=";
                } else if (percentTravel >= i && percentTravel < i + STEP) {
                    log += "o";
                } else {
                    log += "-";
                }
            }
            log += "|";
            System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
