package ss5_accessmodifier_static.bai_tap.bai_tap_3;

import java.util.Scanner;

public class StudentManagement {
    public static Students[] students = new Students[100];
    private Scanner scanner = new Scanner(System.in);

    static {
        Students students1 = new Students("NhƠn", 20);
        Students students2 = new Students("Nhan", 21);
        Students students3 = new Students("Nhi", 22);
        students[0] = students1;
        students[1] = students2;
        students[2] = students3;
    }

    public void display() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                students[i].setId(i);
                System.out.println(students[i]);
            } else {
                break;
            }
        }
    }

    public void add() {
        System.out.println("enter name student");
        String name = scanner.nextLine();
        System.out.println("enter old student");
        int old = Integer.parseInt(scanner.nextLine());
        Students student = new Students(name, old);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void delete() {
        this.display();
        System.out.println("enter id want to delete");
        int idDelete = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            } else {
                break;
            }
        }
        while (idDelete < 0 || idDelete > count) {
            System.out.println("re-enter id want to delete");
            idDelete = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < students.length; i++) {
            if (i == idDelete) {
                students[i] = null;
                break;
            } else {
                System.out.println("can not find id");
            }
        }


        for (int j = 0; j < students.length; j++) {
            if (students[j] == null && students[j + 1] != null) {
                Students temp = students[j];
                students[j] = students[j + 1];
                students[j + 1] = temp;
            } else {
                break;
            }
        }
    }

    public void update() {
        this.display();
        System.out.println("enter id want to update");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            } else {
                break;
            }
        }
        while (idUpdate < 0 || idUpdate > count) {
            System.out.println("enter id want to update");
            idUpdate = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("enter name want to update");
        String nameUpdate = scanner.nextLine();
        System.out.println("enter old want to update");
        int oldUpdate = Integer.parseInt(scanner.nextLine());
        students[idUpdate].setName(nameUpdate);
        students[idUpdate].setOld(oldUpdate);
    }

    public void search() {
        System.out.println("enter search string");
        String searchString = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            } else if (students[i].getName().toLowerCase().contains(searchString)) {
                System.out.println(students[i]);
            }
        }
    }
}
