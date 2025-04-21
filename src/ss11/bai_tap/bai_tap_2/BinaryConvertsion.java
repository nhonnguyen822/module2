package ss11.bai_tap.bai_tap_2;

import java.util.Stack;

public class BinaryConvertsion {
    public static void main(String[] args) {
        int number = 30;
        Stack<Integer> binary = new Stack<>();
        while (number > 0) {
            int soDu = number % 2;
            binary.push(soDu);
            number = number / 2;
        }
        System.out.println(binary);
        Stack<Integer> binary1 = new Stack<>();
        String result = "";
        while (!binary.empty()) {
            result += binary1.push(binary.pop());
        }
        System.out.println(result);
    }

}
