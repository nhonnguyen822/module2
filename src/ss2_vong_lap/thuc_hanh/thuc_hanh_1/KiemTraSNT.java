package ss2_vong_lap.thuc_hanh.thuc_hanh_1;

import java.util.Scanner;

public class KiemTraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("input n");
            n = Integer.parseInt(scanner.nextLine());

        } while (n < 0);
        boolean test = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                test = false;
            }
        }
        if (test && n>=2) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}
