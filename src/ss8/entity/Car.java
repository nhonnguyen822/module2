package ss8.entity;

public class Car extends Vehicle {
    private int numberOfSeat;
    private String carType;

    public Car() {
    }

    public Car(int numberOfSeat, String carType) {
        this.numberOfSeat = numberOfSeat;
        this.carType = carType;
    }

    public Car(String licensePlate, String manufacturerName, int yearManafacture, String owner, int numberOfSeat, String carType) {
        super(licensePlate, manufacturerName, yearManafacture, owner);
        this.numberOfSeat = numberOfSeat;
        this.carType = carType;
    }
    public int getNumberOfSeat() {

        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                "numberOfSeat=" + numberOfSeat +
                ", carType='" + carType + '\'' +
                '}';
    }
}
