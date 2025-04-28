package study.view;

import study.common.KieuThue;
import study.enity.House;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HouseView {
    private static final Scanner scanner = new Scanner(System.in);

    public static House add() {
        System.out.println("nhập mã dich vu");
        String maDV = scanner.nextLine();
        while (true) {
            String regex = "SVHO-\\d{4}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(maDV);
            if (matcher.matches()) {
                System.out.println("mã hợp lệ");
                break;
            } else {
                System.out.println("mã không hợp lệ");
                System.out.println("nhập mã dich vu");
                maDV = scanner.nextLine();
            }
        }
        System.out.println("nhập tên dịch vụ");
        String tenDV = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*)+(\\s[A-Z][a-z]*)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(tenDV);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("tên không hợp lệ");
                System.out.println("nhập tên dịch vụ");
                tenDV = scanner.nextLine();
            }
        }
        System.out.println("nhập diện tích sử dụng");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        while (dienTichSuDung < 30) {
            System.out.println("diện tích sử dụng không thể nhỏ hơn 30");
            System.out.println("nhập diện tích sử dụng");
            dienTichSuDung = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("nhập chi phí thuê");
        int chiPhiThue = Integer.parseInt(scanner.nextLine());
        while (chiPhiThue <= 0) {
            System.out.println("chi phí thuê phải lớn hơn 0");
            System.out.println("nhập chi phí thuê");
            chiPhiThue = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("nhập số lượng người tối đa");
        int soLuongNguoi = Integer.parseInt(scanner.nextLine());
        while (soLuongNguoi <= 0 || soLuongNguoi > 20) {
            System.out.println("số lượng người phải lớn hơn 0 và nhỏ hơn 20");
            System.out.println("nhập số lượng người tối đa");
            soLuongNguoi = Integer.parseInt(scanner.nextLine());
        }

        KieuThue kieuThue = null;
        while (kieuThue == null) {
            System.out.println("nhập kiểu thuê");
            String input = scanner.nextLine();
            kieuThue = KieuThue.fromToString(input);
            if (kieuThue == null) {
                System.out.println("kiêu thuê phải năm ,thang ,ngay ,gio");
            }
        }

        System.out.println("nhập tiêu chuẩn phòng");
        String tieuChuanPhong = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*)+(\\s[A-Z][a-z]*)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(tieuChuanPhong);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("tên không hợp lệ");
                System.out.println("nhập lại tiêu chuẩn phòng");
                tieuChuanPhong = scanner.nextLine();
            }
        }
        System.out.println("nhập số tầng ");
        int soTang = Integer.parseInt(scanner.nextLine());
        while (soTang < 0) {
            System.out.println("số tầng không thể nhỏ hơn 0");
            System.out.println("nhập số tầng ");
            soTang = Integer.parseInt(scanner.nextLine());
        }
        return new House(maDV, tenDV, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, tieuChuanPhong, soTang);
    }

}
//    : Mã dịch vụ, Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê
