package ss4_oop.bai_tap.bai_tap_2;

public class StopWatch {
    private long starTime;
    private long endTime;

    public StopWatch() {
    }

    public long getStarTime() {
        return this.starTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getElapsedTime() {
        return this.endTime - this.starTime;
    }

    public void start() {
        this.starTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
}
