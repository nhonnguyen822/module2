package ss3.mang.bai_tap.bai_tap_2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
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
        System.out.println("input element to add");
        int elementAdd = Integer.parseInt(scanner.nextLine());
        int indexToInsert;
        do {
            System.out.println("input index to insert");
            indexToInsert = Integer.parseInt(scanner.nextLine());
        } while (indexToInsert < 0);
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < indexToInsert) {
                newArray[i] = array[i];
            }
            if (i == indexToInsert) {
                newArray[i] = elementAdd;
            } else {
                newArray[i] = array[i - 1];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
