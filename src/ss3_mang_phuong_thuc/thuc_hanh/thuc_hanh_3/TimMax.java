package ss3_mang_phuong_thuc.thuc_hanh.thuc_hanh_3;

import java.util.Arrays;
import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("input n element in array");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 0 || n >= 20);
        int[] arrInt = new int[n];
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("enter element " + i);
            arrInt[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arrInt));
        int max = arrInt[0];
        int maxIndex = 0;
        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt[i] > max) {
                max = arrInt[i];
                maxIndex = i;
            }
        }
        System.out.println("The largest property value in the list is " + max + " at position " + maxIndex);
    }
}
