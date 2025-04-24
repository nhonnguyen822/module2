package ss8.controller;

import ss8.entity.Car;
import ss8.entity.Motor;
import ss8.entity.Truck;
import ss8.entity.Vehicle;
import ss8.service.CarSevice;
import ss8.service.MotorService;
import ss8.service.TruckService;
import ss8.service.VehicleService;
import ss8.view.CarView;
import ss8.view.MotorView;
import ss8.view.TruckView;
import ss8.view.VehicleView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerManagementVehicle {
    public static void main(String[] args) {
        displayVehicle();
    }

    public static void displayVehicle() {
        String exit = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát\n");
            System.out.println(" enter your chose ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    System.out.println("Y or N");
                    exit = scanner.nextLine();
                    break;

                default:
                    break;
            }
            if (chose == 4 && exit.toLowerCase().equals("y")) {
                break;
            }
        } while (true);
    }

    private static CarSevice carSevice = new CarSevice();
    private static TruckService truckService = new TruckService();
    private static MotorService motorService = new MotorService();

    public static void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Hiện thị phương tiện" +
                        "1. Hiện thị xe tải.\n" +
                        "2. Hiện thị ôtô. \n" +
                        "3. Hiện  xe máy\n");
        System.out.println(" enter your chose ");
        int chose = Integer.parseInt(scanner.nextLine());
        switch (chose) {
            case 1:
                List<Truck> trucks = truckService.findAll();
                TruckView.display(trucks);
                break;
            case 2:
                List<Car> cars = carSevice.findAll();
                CarView.display(cars);

                break;
            case 3:
                List<Motor> motors = motorService.findAll();
                MotorView.display(motors);

        }
    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Hiện thị phương tiện" +
                        "1. Them moi xe tải.\n" +
                        "2. Them moi ôtô. \n" +
                        "3. Them moi xe máy\n");
        System.out.println(" enter your chose ");
        int chose = Integer.parseInt(scanner.nextLine());
        switch (chose) {
            case 1:
                Truck truck = TruckView.inputDataForMotor();
                truckService.add(truck);
                break;
            case 2:
                Car car = CarView.inputDataForCar();
                carSevice.add(car);
                break;
            case 3:
                Motor motor = MotorView.inputDataForMotor();
                motorService.add(motor);
                break;
        }
    }

    private static VehicleService vehicleService = new VehicleService();

    public static void delete() {
        String licencaPlate = VehicleView.licencaPlate();
        Vehicle vehicle = vehicleService.findLicencaPlate(licencaPlate);
        if (vehicle != null) {
            vehicleService.delete(vehicle);
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }
}
