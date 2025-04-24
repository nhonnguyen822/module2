package ss8.entity;

public class Truck extends Vehicle {
    private double payload;

    public Truck() {
    }

    public Truck(double payload) {
        this.payload = payload;
    }

    public Truck(String licenseplate, String manufacturerName, int yearManafacture, String owner, double payload) {
        super(licenseplate, manufacturerName, yearManafacture, owner);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "payload=" + payload +
                '}';
    }

    @Override
    public String converToString() {
        return super.getLicenseplate() + "," + super.getManufacturerName() +
                "," + super.getYearManafacture() + "," + super.getOwner() + "," + this.payload;
    }
}
