package ss3_mang_phuong_thuc.bai_tap.bai_tap_1;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("input n element in array");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 0 || n > 20);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("input x to delete");
        int x = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == x) {
                count++;
            }
        }
        int arrNewIndex = 0;
        int[] arrayNew = new int[array.length - count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != x) {
                arrayNew[arrNewIndex] = array[i];
                arrNewIndex++;
            }
        }
        System.out.println("Array: " + Arrays.toString(arrayNew));
    }
}
