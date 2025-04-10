package ss3_mang_phuong_thuc.thuc_hanh.thuc_hanh_5;

import java.util.Arrays;
import java.util.Scanner;

public class TimMin {
    public static int timMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("input n element in array");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 0 || n > 20);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter element");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.println("min of array " + timMin(array));
    }
}
