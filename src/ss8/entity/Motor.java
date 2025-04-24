package ss8.entity;

public class Motor extends Vehicle {
    public double capacity;

    public Motor() {
    }

    public Motor(double capacity) {
        this.capacity = capacity;
    }

    public Motor(String licenseplate, String manufacturerName, int yearManafacture, String owner, double capacity) {
        super(licenseplate, manufacturerName, yearManafacture, owner);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motor{" +
                super.toString() +
                "capacity=" + capacity +
                '}';
    }

    @Override
    public String converToString() {
        return super.getLicenseplate()+","+super.getManufacturerName()+
                ","+super.getYearManafacture()+","+super.getOwner()+","+this.capacity;
    }
}
