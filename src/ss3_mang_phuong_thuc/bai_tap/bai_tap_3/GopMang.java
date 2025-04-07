package ss3.mang.bai_tap.bai_tap_3;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        do {
            System.out.println("input m element in array1");
            m = Integer.parseInt(scanner.nextLine());
        } while (m <= 0 || m > 20);
        int[] array1 = new int[m];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("enter element in array 1");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        int n;
        do {
            System.out.println("input n element in array2");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 0 || n > 20);
        int[] array2 = new int[n];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("enter element in array 2");
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - array1.length];
            }
        }
        System.out.println("array3: " + Arrays.toString(array3));
    }
}
