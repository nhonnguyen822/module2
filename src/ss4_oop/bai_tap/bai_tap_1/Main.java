package ss4_oop.bai_tap.bai_tap_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("enter b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("enter c");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDisciminant() > 0) {
            System.out.println("rood 1 of quadratic equation :" + quadraticEquation.getRoot1());
            System.out.println("rood 2 of quadratic equation :" + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDisciminant() == 0) {
            System.out.println("rood of quadratic equation :" + quadraticEquation.getRoot1());

        } else {
            System.out.println("the equation has no roots");
        }
    }
}
