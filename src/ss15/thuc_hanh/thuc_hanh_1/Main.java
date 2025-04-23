package ss15.thuc_hanh.thuc_hanh_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        arrayNumber();
    }

    public static void arrayNumber() {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scaner = new Scanner(System.in);

        int x = -1;
        int element = 0;
        while (true) {
            System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
            try {
                x = Integer.parseInt(scaner.nextLine());
                element = arr[x];
                break;
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Chỉ số vượt quá giới hạn của mảng");
            } catch (NumberFormatException e) {
                System.out.println(" loi dinh dang number");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        element = arr[x];
        System.out.println("gia tri cua phan tu " + x + " la : " + element);
    }
}
