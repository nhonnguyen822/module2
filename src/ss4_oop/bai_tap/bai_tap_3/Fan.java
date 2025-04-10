package ss4_oop.bai_tap.bai_tap_3;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";

    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setSpeed(int speed) {
        if (speed < 1 || speed > 3) {
            this.speed = SLOW;
        } else {
            this.speed = speed;
        }
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String fanInformation() {
        if (this.on) {
            return "speed :" + this.speed + " color: " + color + " fan is on ";
        }
        return " color: " + color + " fan is off ";
    }

}
