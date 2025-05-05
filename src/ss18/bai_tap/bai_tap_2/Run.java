package ss18.bai_tap.bai_tap_2;

public class Run {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread("A");
        OddThread oddThread = new OddThread("B");
        oddThread.start();
        evenThread.start();
    }
}
