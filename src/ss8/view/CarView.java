package ss8.view;

import ss8.entity.Car;

import java.util.ArrayList;
import java.util.Scanner;
public class CarView {
    private static Scanner scanner = new Scanner(System.in);

    public static void display(ArrayList<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }

    public static String inputlicenseplate() {
        System.out.println("enter licenseplate");
        return scanner.nextLine();
    }

    public static Car inputDataForCar() {
        System.out.println("enter licenseplate");
        String licenseplate = scanner.nextLine();
        System.out.println("enter manufacturerName");
        String manufacturerName = scanner.nextLine();
        System.out.println("enter yearManafacture");
        int yearManafacture = Integer.parseInt(scanner.nextLine());
        System.out.println("enter owner");
        String owner = scanner.nextLine();
        System.out.println("enter numberOfSeat");
        int numberOfSeat = Integer.parseInt(scanner.nextLine());
        System.out.println("enter carType");
        String carType = scanner.nextLine();
        return new Car(licenseplate, manufacturerName, yearManafacture, owner, numberOfSeat, carType);

    }
}
