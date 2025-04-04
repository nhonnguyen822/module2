package ss1_tong_quan_java.thuc_hanh.thuc_hanh_7;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height, weight, bmi;
        System.out.println("input your height");
        height = scanner.nextDouble();
        System.out.println("input your weight");
        weight = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
