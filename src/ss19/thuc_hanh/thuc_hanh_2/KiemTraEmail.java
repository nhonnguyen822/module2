package ss19.thuc_hanh.thuc_hanh_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KiemTraEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhâp email");
        String email = scanner.nextLine();
        while (true) {
            String regexEmail = "^[A-Za-z0-9][a-zA-Z0-9]*@[A-Za-z0-9]+(\\.[a-zA-Z0-9]{2,})$";
            Pattern pattern = Pattern.compile(regexEmail);
            Matcher matcher= pattern.matcher(email);
            if(matcher.matches()){
                System.out.println("email hợp lệ ");
                break;
            }else {
                System.out.println("email không hợp lệ");
                System.out.println("nhâp email");
                 email = scanner.nextLine();
            }

        }
    }
}
