package ss11.bai_tap.bai_tap_3;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String string = "SOS";
        String[] strings = string.split("");
        Stack<String> sStack = new Stack<>();
        for (int i = 0; i < strings.length; i++) {
            sStack.push(strings[i]);
        }
        Queue<String> stringQueue = new ArrayDeque<>();
        for (int i = 0; i < strings.length; i++) {
            stringQueue.offer(strings[i]);
        }
        boolean test = true;
        for (int i = 0; i < strings.length; i++) {
            if (!sStack.pop().equals(stringQueue.poll())) {
                System.out.println("is not Palindrome");
                test = false;
                break;
            }
        }
        if (test) {
            System.out.println("is Palindrome");
        }


    }
}
