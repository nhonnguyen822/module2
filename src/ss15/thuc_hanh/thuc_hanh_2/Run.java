package ss15.thuc_hanh.thuc_hanh_2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        while (true) {
            try {
                System.out.println("nhap x");
                x = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (true) {
            try {
                System.out.println("nhap y");
                y = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        CalculationExample.calc(x, y);
        System.out.println("end");
    }
}
