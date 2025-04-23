package ss15.bai_tap.bai_tap_1;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        while (true) {
            while (true) {
                try {
                    System.out.println("nhap canh a");
                    a = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            while (true) {
                try {
                    System.out.println("nhap canh b");
                    b = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            while (true) {
                try {
                    System.out.println("nhap canh c");
                    c = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                Triangle textTriangle = new Triangle(a, b, c);
                System.out.println("tam giác hợp lệ");
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
