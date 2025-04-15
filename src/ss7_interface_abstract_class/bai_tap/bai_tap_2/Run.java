package ss7_interface_abstract_class.bai_tap.bai_tap_2;

public class Run {
    public static void main(String[] args) {
        Square square=new Square();
        System.out.println(square);
        square=new Square(5,"while");
        System.out.println(square);
        square.howToColor();
    }
}
