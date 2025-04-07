package ss2_vong_lap.bai_tap.bai_tap_3;

public class TimSNT {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean test = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    test = false;
                    break;
                }
            }
            if (test) {
                System.out.println("SNT :" + i);
            }
        }
    }
}
