package ss2_vong_lap.bai_tap.bai_tap_2;

import java.util.Scanner;

public class HienThi20SNT {
    public static void main(String[] args) {
        int count = 0;
        int soNT = 2;
        while (count <= 20) {
            boolean test = true;
            for (int i = 2; i < soNT; i++) {
                if (soNT % i == 0) {
                    test = false;
                    break;
                }
            }
            if (test) {
                System.out.println(soNT);
                count++;
            }
            soNT++;
        }
    }
}
