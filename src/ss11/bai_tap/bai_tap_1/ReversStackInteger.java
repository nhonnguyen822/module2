package ss11.bai_tap.bai_tap_1;

import java.util.List;
import java.util.Stack;

public class ReversStackInteger {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(1);
        integers.push(2);
        integers.push(3);
        integers.push(4);
        integers.push(5);
        System.out.println(integers);
        int size = integers.size();
        Stack<Integer> integers1 = new Stack<>();
        for (int i = 0; i < size; i++) {
            integers1.push(integers.pop());
        }
        System.out.println(integers1);
    }

}
