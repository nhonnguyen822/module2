package ss3.mang.bai_tap.bai_tap_6;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        do {
            System.out.println("input row ");
            row = Integer.parseInt(scanner.nextLine());
        } while (row <= 0 || row > 20);
        int col;
        do {
            System.out.println("input col");
            col = Integer.parseInt(scanner.nextLine());
        } while (col <= 0 || col > 20);
        double[][] arr = new double[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("enter element " + i + " " + j);
                arr[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));
        double sum = 0;
        System.out.println("Enter the number of columns you want to sum");
        int colWantToSum = Integer.parseInt(scanner.nextLine());
        while (colWantToSum < 0 || colWantToSum >= arr.length) {
            colWantToSum = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == colWantToSum) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("sum to columns " + colWantToSum + " = " + sum);
    }
}
