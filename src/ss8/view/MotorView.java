package ss8.view;
import ss8.entity.Motor;
import java.util.ArrayList;
import java.util.Scanner;
public class MotorView {
    private static Scanner scanner = new Scanner(System.in);

    public static void display(ArrayList<Motor> motors) {
        for (int i = 0; i < motors.size(); i++) {
            System.out.println(motors.get(i));
        }
    }


    public static Motor inputDataForMotor() {
        System.out.println("enter licenseplate");
        String licenseplate = scanner.nextLine();
        System.out.println("enter manufacturerName");
        String manufacturerName = scanner.nextLine();
        System.out.println("enter yearManafacture");
        int yearManafacture = Integer.parseInt(scanner.nextLine());
        System.out.println("enter owner");
        String owner = scanner.nextLine();
        System.out.println("enter capacity");
        int capacity = Integer.parseInt(scanner.nextLine());
        return new Motor(licenseplate, manufacturerName, yearManafacture, owner, capacity);
    }

}
