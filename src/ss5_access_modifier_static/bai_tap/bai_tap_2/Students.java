package ss5_access_modifier_static.bai_tap.bai_tap_2;

public class Students {
    private String name = "join";
    private String classed = "C02";

    public Students() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassed() {
        return classed;
    }

    public void setClassed(String classed) {
        this.classed = classed;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", classed='" + classed + '\'' +
                '}';
    }
}
