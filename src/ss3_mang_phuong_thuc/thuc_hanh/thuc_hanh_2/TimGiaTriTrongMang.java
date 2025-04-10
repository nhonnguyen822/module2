package ss3_mang_phuong_thuc.thuc_hanh.thuc_hanh_2;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input name ");
        String name = scanner.nextLine();
        System.out.println("input n element array");
        int n = Integer.parseInt(scanner.nextLine());
        String[] arrName = new String[n];
        for (int i = 0; i < arrName.length; i++) {
            System.out.println("enter name in array " + i);
            arrName[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(arrName));
        boolean isExist = false;
        for (int i = 0; i < arrName.length; i++) {
            if (name.equals(arrName[i])) {
                System.out.println("Position of the students in the list " + name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + name + " in the list.");
        }
    }
}
