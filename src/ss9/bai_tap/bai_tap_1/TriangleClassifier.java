package ss9.bai_tap.bai_tap_1;

public class TriangleClassifier {
    public static String triangleClassifier(int number1, int number2, int number3) {
        if (number1 <= 0 || number2 <= 0 || number3 <= 0
                || number1 + number2 < number3
                || number2 + number3 < number1
                || number1 + number3 < number2) {
            return "không phải là tam giác";
        } else if (number1 == number2 && number1 == number3) {
            return "Tam giác đều";
        } else if (number1 == number2 || number2 == number3 || number1 == number3) {
            return "Tam giác cân";
        }
        return "Tam giác thường";
    }
}
