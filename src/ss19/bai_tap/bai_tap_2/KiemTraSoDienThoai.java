package ss19.bai_tap.bai_tap_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KiemTraSoDienThoai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số điện thoại");
        String soDT = scanner.nextLine();
        while (true) {
            String regex = "^([0-9]{2}-)?(0[0-9]{9})$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(soDT);
            if (matcher.matches()) {
                System.out.println("số hợp lệ");
                break;
            } else {
                System.out.println("số không hợp lệ");
                System.out.println("nhập lại số điện thoại");
                soDT = scanner.nextLine();
            }
        }
    }
}
