package ss1_tong_quan_java.thuc_hanh.thuc_hanh_6;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        do {
            System.out.println("input year");
            year = Integer.parseInt(scanner.nextLine());
        } while (year < 0);

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is leap year");
                } else {
                    System.out.println(year + " is not leap year");
                }
            } else {
                System.out.println(year + " is leap year");
            }
        } else {
            System.out.println(year + " is not leap year ");
        }
    }
}
