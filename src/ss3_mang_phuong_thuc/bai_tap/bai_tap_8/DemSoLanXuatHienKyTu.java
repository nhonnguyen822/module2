package ss3_mang_phuong_thuc.bai_tap.bai_tap_8;

import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a string ");
        String str = scanner.nextLine();
        while (str.trim().isEmpty()) {
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
