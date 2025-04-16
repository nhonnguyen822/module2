package ss8.view;

import ss8.entity.Truck;
import java.util.ArrayList;
import java.util.Scanner;

public class TruckView {
    private static Scanner scanner = new Scanner(System.in);

    public static void display(ArrayList<Truck> trucks) {
        for (int i = 0; i < trucks.size(); i++) {
            System.out.println(trucks.get(i));
        }
    }

    public static Truck inputDataForMotor() {
        System.out.println("enter licenseplate");
        String licenseplate = scanner.nextLine();
        System.out.println("enter manufacturerName");
        String manufacturerName = scanner.nextLine();
        System.out.println("enter yearManafacture");
        int yearManafacture = Integer.parseInt(scanner.nextLine());
        System.out.println("enter owner");
        String owner = scanner.nextLine();
        System.out.println("enter payload");
        double payload = Double.parseDouble(scanner.nextLine());
        return new Truck(licenseplate, manufacturerName, yearManafacture, owner, payload);
    }
}
