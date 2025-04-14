package ss5_access_modifier_static.thuc_hanh.thuc_hanh_2;

public class Run {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCar);
        Car car3 = new Car("Mazda 9", "Skyactiv 9");
        System.out.println(Car.numberOfCar);
    }
}
