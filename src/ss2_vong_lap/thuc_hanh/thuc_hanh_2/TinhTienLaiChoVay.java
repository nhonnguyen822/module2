package ss2_vong_lap.thuc_hanh.thuc_hanh_2;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input moneys");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.println("input year interest");
        double yearInterest = Double.parseDouble(scanner.nextLine());
        System.out.println("input loan month");
        int loanMonth = Integer.parseInt(scanner.nextLine());
        double interest = money * (yearInterest / 100) / 12 * loanMonth;
        System.out.println("interest : " + String.format("%.2f", interest));
    }
}
