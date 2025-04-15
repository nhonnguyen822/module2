package ss7_interface_abstract_class.thuc_hanh.thuc_hanh_2;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (super.getRadius() > o.getRadius()) {
            return 1;
        } else if (super.getRadius() < o.getRadius()) {
            return -1;
        }
        return 0;
    }
}
