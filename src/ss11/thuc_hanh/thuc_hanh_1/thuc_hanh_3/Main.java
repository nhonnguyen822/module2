package ss11.thuc_hanh.thuc_hanh_1.thuc_hanh_3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nhu");
        Student student2 = new Student(2, "Nho");
        Student student4 = new Student(4, "Nhi");
        Student student3 = new Student(2, "Nha");
        Stack<Student> studentStack = new Stack<>();
        studentStack.push(student1);
        studentStack.push(student2);
        studentStack.push(student3);
        studentStack.push(student4);
        System.out.println(studentStack);
        Collections.sort(studentStack, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o2.getId() - o1.getId();
                if (result == 0) {
                    o2.getName().compareTo(o1.getName());
                }
                return result;
            }
        });
        System.out.println(studentStack);
    }
}
