package ss5_accessmodifier_static.thuc_hanh.thuc_hanh_1;

public class Run {
    public static void main(String[] args) {
        Students.change();
        Students student1 = new Students(111, "Hoang");
        Students student2 = new Students(222, "Khanh");
        Students student3 = new Students(333, "Nam");
        student1.display();
        student2.display();
        student3.display();
    }
}
