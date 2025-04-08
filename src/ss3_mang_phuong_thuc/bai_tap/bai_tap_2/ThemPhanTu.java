package ss3_mang_phuong_thuc.bai_tap.bai_tap_2;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("enter element");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.println("input element to add");
        int element = Integer.parseInt(scanner.nextLine());
        System.out.println("input index to add");
        int index = Integer.parseInt(scanner.nextLine());
        while (index > array.length || index <= 0) {
            System.out.println("input index to add");
            index = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                for (int j = array.length - 1; j > i; j--) {
                    Integer temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
                array[i] = element;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
