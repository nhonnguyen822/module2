package ss8.entity;

public abstract class Vehicle {
    private String licenseplate;
    private String manufacturerName;
    private int yearManafacture;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String licenseplate, String manufacturerName, int yearManafacture, String owner) {
        this.licenseplate = licenseplate;
        this.manufacturerName = manufacturerName;
        this.yearManafacture = yearManafacture;
        this.owner = owner;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getYearManafacture() {
        return yearManafacture;
    }

    public void setYearManafacture(int yearManafacture) {
        this.yearManafacture = yearManafacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return
                "licenseplate='" + licenseplate + '\'' +
                        ", manufacturerName='" + manufacturerName + '\'' +
                        ", yearManafacture=" + yearManafacture +
                        ", owner='" + owner + '\'';
    }
}
