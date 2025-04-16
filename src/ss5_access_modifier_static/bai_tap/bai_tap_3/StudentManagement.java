package ss5_access_modifier_static.bai_tap.bai_tap_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManagement {
    public static Students[] students = new Students[3];
    private Scanner scanner = new Scanner(System.in);

    static {
        Students students1 = new Students(0, "NhƠn", 20);
        Students students2 = new Students(5, "Nhan", 21);
        Students students3 = new Students(10, "Nhi", 22);
        students[0] = students1;
        students[1] = students2;
        students[2] = students3;
    }

    public void display() {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            } else {
                break;
            }
        }
        Students[] students1 = new Students[count];
        for (int i = 0; i < students1.length; i++) {
            students1[i] = students[i];
        }
        Arrays.sort(students1, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (int i = 0; i < students1.length; i++) {
            System.out.println(students1[i]);
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
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == idDelete) {
                System.out.println(" DO you want exit ?(Y or N)");
                String yesOrNo = scanner.nextLine();
                while (!yesOrNo.toLowerCase().equals("y") && !yesOrNo.toLowerCase().equals("n")) {
                    System.out.println(" DO you want exit ?(Y or N)");
                    yesOrNo = scanner.nextLine();
                }
                if (yesOrNo.equals("y") || yesOrNo.equals("Y")) {
                    students[i] = null;
                    break;
                } else {
                    break;
                }
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
        System.out.println(" DO you want exit ?(Y or N)");
        String yesOrNo = scanner.nextLine();
        while (!yesOrNo.toLowerCase().equals("y") && !yesOrNo.toLowerCase().equals("n")) {
            System.out.println(" DO you want exit ?(Y or N)");
            yesOrNo = scanner.nextLine();
        }
        if (yesOrNo.equals("y") || yesOrNo.equals("Y")) {
            students[idUpdate].setName(nameUpdate);
            students[idUpdate].setOld(oldUpdate);
        }
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

//    @Override
//    public int compare(Students o1, Students o2) {
//        return 0;
//    }
}
