package ss18.bai_tap.bai_tap_1;

public class Run {
    public static void main(String[] args) {
        NumberGenerato numberGenerato = new NumberGenerato("A", Thread.MAX_PRIORITY);
        NumberGenerato numberGenerato1 = new NumberGenerato("B", Thread.MIN_PRIORITY);
        numberGenerato.start();
        numberGenerato1.start();
    }
}
