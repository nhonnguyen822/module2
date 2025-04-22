package ss12.thuc_hanh.thuc_hanh_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Text {
    public static void main(String[] args) {
        Student student1 = new Student(5, "nhi");
        Student student2 = new Student(2, "nho");
        Student student3 = new Student(2, "nhu");
        Student student4 = new Student(4, "nhe");
        Map<Student, Integer> studentMap = new TreeMap<>();
        studentMap.put(student1, 5);
        studentMap.put(student2, 10);
        studentMap.put(student3, 15);
        studentMap.put(student4, 20);
        Set<Student> studentSet = studentMap.keySet();
        for (Student s : studentSet) {
            System.out.println("studen " + s.getName() + " vang " + studentMap.get(s) + " ngay");
        }
        System.out.println(studentMap.containsKey(student1));
        if (studentMap.containsKey(student1)) {
            studentMap.replace(student1, studentMap.get(student1) + 1);
        } else {
            studentMap.put(student1, 10);
        }
        Set<Map.Entry<Student, Integer>> sets = studentMap.entrySet();
        for (Map.Entry<Student, Integer> set : sets) {
            System.out.println(set.getKey());
            System.out.println(set.getValue());
        }
    }
}
