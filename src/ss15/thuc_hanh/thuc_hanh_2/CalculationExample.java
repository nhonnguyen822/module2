package ss15.thuc_hanh.thuc_hanh_2;

public class CalculationExample {
    public static void calc(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("tong x + Y la :" + a);
            System.out.println("hieu x - Y la :" + b);
            System.out.println("tich x * Y la :" + c);
            System.out.println("thuong x : Y la :" + d);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
