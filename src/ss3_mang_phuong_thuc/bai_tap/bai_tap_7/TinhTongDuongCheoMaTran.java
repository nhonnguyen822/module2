package ss3.mang.bai_tap.bai_tap_7;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongDuongCheoMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        do {
            System.out.println("input row ");
            row = Integer.parseInt(scanner.nextLine());
        } while (row <= 0 || row > 20);
        double[][] array = new double[row][row];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("enter element " + i + " " + j);
                array[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        double sum = 0;
        System.out.println("array: " + Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == (array.length - 1 - i)) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("sum :" + sum);
    }
}
