package ss5_accessmodifier_static.thuc_hanh.thuc_hanh_2;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;

    public Car(String name, String engine) {
        this.engine = engine;
        this.name = name;
        numberOfCar++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

}
