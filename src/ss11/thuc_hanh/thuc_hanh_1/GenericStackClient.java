package ss11.thuc_hanh.thuc_hanh_1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class GenericStackClient {
    public static void main(String[] args) {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.println("2.2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        MyGenericStack<String> stack1 = new MyGenericStack();
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
        stack1.push("ONE");
        stack1.push("TWO");
        stack1.push("THREE");
        stack1.push("FOUR");
        stack1.push("FIVE");
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }
    }
}
