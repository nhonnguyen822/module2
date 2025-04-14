package ss6_inheritance.thuc_hanh.thuc_hanh_1;

public class TextCirle {
    public static void main(String[] args) {
        Cirle cirle = new Cirle();
        System.out.println(cirle);
        cirle = new Cirle(3.5);
        System.out.println(cirle);
        cirle = new Cirle(3.5, false, "indigo");
        System.out.println(cirle);
    }
}
