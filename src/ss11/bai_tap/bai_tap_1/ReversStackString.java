package ss11.bai_tap.bai_tap_1;

import java.util.Stack;

public class ReversStackString {
    public static void main(String[] args) {
        String string1 = "Nguyen Thanh  Nhon";
        Stack<String> strings1 = new Stack<>();
        String[] strings = string1.split("");
        for (int i = 0; i < strings.length; i++) {
            strings1.push(strings[i]);
        }
        System.out.println(string1);
        int size = strings1.size();
        Stack<String> wStack = new Stack<>();
        for (int i = 0; i < size; i++) {
            wStack.push(strings1.pop());
        }
        String result = String.join("",wStack);
        System.out.println(result);
    }
}
