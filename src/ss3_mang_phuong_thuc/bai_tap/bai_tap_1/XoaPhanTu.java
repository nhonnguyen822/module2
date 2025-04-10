package ss3_mang_phuong_thuc.bai_tap.bai_tap_1;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter element");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.println("enter element to delete");
        int elementDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            } else if (array[i].equals(elementDelete)) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = null;
                    Integer temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                i--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
