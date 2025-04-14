package ss6_inheritance.thuc_hanh.thuc_hanh_1;

public class Shape {
    private String color = "green";
    private Boolean filler = true;

    public Shape() {
    }

    public Shape(Boolean filler, String color) {
        this.filler = filler;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFiller() {
        return filler;
    }

    public void setFiller(Boolean filler) {
        this.filler = filler;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (getFiller() ? "filler" : "not filler ");
    }
}
