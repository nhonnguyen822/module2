package ss3.mang.bai_tap.bai_tap_8;

import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a string ");
        String str = scanner.nextLine();
        while (str.length() == 0) {
            System.out.println("input a string ");
            str = scanner.nextLine();
        }
        System.out.println("input check character");
        String character = scanner.nextLine();
        while (character.length() != 1) {
            System.out.println("re-enter character");
            character = scanner.nextLine();
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(character)) {
                count++;
            }
        }
        System.out.println("count :" + count);
    }
}
