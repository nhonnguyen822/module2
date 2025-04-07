package ss3.mang.bai_tap.bai_tap_4;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanMaxMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;
        do {
            System.out.println("input row  in array");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 0 || n > 20);
        do {
            System.out.println("input col  in array");
            m = Integer.parseInt(scanner.nextLine());
        } while (m <= 0 || m > 20);

        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("enter element " + i + " " + j);
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array));
        int rowMaxIndex = 0;
        int colMaxIndex = 0;
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    rowMaxIndex = i;
                    colMaxIndex = j;
                }
            }
        }
        System.out.println("max of array : " + max + " at location :" + rowMaxIndex + "," + colMaxIndex);
    }
}
