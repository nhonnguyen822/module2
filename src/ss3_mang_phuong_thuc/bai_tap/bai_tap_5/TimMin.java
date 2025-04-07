package ss3.mang.bai_tap.bai_tap_5;

import java.util.Arrays;
import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("input size element in array");
            size = Integer.parseInt(scanner.nextLine());
        } while (size <= 0 || size > 20);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter element");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("array :" + Arrays.toString(array));
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min of array : " + min);
    }
}
