package ss19.bai_tap.bai_tap_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatTenLop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên lớp học ");
        String className = scanner.nextLine();
        while (true) {
            String regex = "^[CPA][0-9]{4}[GHIK]$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(className);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("tên không hợp lệ");
                System.out.println("nhập tên lớp học ");
                className = scanner.nextLine();
            }
        }
    }
}
