package ss3.mang.thuc_hanh.thuc_hanh_4;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int chose;
        while (true) {
            System.out.println("Menu ");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    System.out.println("input Fahrenheit");
                    fahrenheit = Double.parseDouble(scanner.nextLine());
                    System.out.println("Fahrenheit to Celsius :" + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("input Celsius");
                    celsius = Double.parseDouble(scanner.nextLine());
                    System.out.println("Celsius to Fahrenheit :" + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
