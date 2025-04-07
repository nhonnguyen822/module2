package ss2_vong_lap.thuc_hanh.thuc_hanh_3;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("input b");
        int b = Integer.parseInt(scanner.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        int max = 1;
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        } else if (a < b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    max = i;
                }
            }
        } else {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    max = i;
                }
            }
        }
        System.out.println("Greatest common factor: " + max);

    }
}
