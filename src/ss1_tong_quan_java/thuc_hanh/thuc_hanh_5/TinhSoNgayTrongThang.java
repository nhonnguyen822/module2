package ss1_tong_quan_java.thuc_hanh.thuc_hanh_5;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input month");
        int month=Integer.parseInt(scanner.nextLine());
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month"+month+"has  31 days");
                break;
            case 2:
                System.out.println("The month"+month+"has 28 or has 29 days");
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month"+month+"has  30 days");
            default:
                System.out.println("month does not exist");
        }
    }

}
