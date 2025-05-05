package ss18.bai_tap.bai_tap_2;

public class EvenThread extends Thread {
    private String name;

    public EvenThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("thread " + this.name + " :" + i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
