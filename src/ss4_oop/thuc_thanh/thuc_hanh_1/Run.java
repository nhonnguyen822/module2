package ss4_oop.thuc_thanh.thuc_hanh_1;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the height");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("enter the width");
        double width = Double.parseDouble(scanner.nextLine());
        Retangle retangle = new Retangle(width, height);
        System.out.println("your rectangle :" + retangle.display());
        System.out.println("area of the rectangle " + retangle.getArea());
        System.out.println("perimeter of the rectangle " + retangle.getPerimeter());
    }
}
