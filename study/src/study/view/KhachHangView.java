package study.view;

import study.common.GioiTinh;
import study.common.LoaiKhachHang;
import study.enity.KhachHang;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KhachHangView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String nhapMaKH() {
        System.out.println("nhập mã khách hang ");
        return scanner.nextLine();
    }

    public static void display(List<KhachHang> khachHangList) {
        for (int i = 0; i < khachHangList.size(); i++) {
            System.out.println(khachHangList.get(i));
        }
    }


    public static KhachHang inputDataKH(){
        System.out.println("nhập mã khách hàng ");
        String maKH = scanner.nextLine();
        while (true) {
            String regex = "^NV-\\d{4}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(maKH);
            if (matcher.matches()) {
                System.out.println("mã hợp lệ");
                break;
            } else {
                System.out.println("mã không hợp lệ");
                System.out.println("nhập lại mã khách ");
                maKH = scanner.nextLine();
            }
        }
        System.out.println("nhập tên khách hàng ");
        String tenKH = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)?(\\s[A-Z][a-z]*)+&";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(tenKH);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("tên không hợp lệ");
                System.out.println("nhập lại tên khách ");
                tenKH = scanner.nextLine();
            }
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate ngaySinh = null;
        while (true) {
            System.out.println("nhập ngày sinh với đinh dạng dd/MM/yy");
            String input = scanner.nextLine();
            try {
                ngaySinh = LocalDate.parse(input, dateTimeFormatter);
                break;
            } catch (Exception e) {
                System.out.println("ngày sinh không hợp lệ");
            }
        }

        GioiTinh gioiTinh = null;
        while (gioiTinh == null) {
            System.out.println("nhập giới tính ");
            String input = scanner.nextLine();
            gioiTinh = GioiTinh.fromToString(input);
            if (gioiTinh == null) {
                System.out.println("nhập lại giới tính ");
            }
        }
        System.out.println("nhập số CMND /CCCD");
        String soCMND = scanner.nextLine();
        while (true) {
            String regexCMND = "^\\d{9}(\\d{3})?$";
            Pattern pattern = Pattern.compile(regexCMND);
            Matcher matcher = pattern.matcher(soCMND);
            if (matcher.matches()) {
                System.out.println("số CMND/CCCD hợp lệ");
                break;
            } else {
                System.out.println("CMND không hợp lệ");
                System.out.println("nhập lại số CMND /CCCD");
                soCMND = scanner.nextLine();
            }
        }
        System.out.println("nhập số điện thoại ");
        String soDT = scanner.nextLine();
        while (true) {
            String regexSoDT = "^(\\d{2}-)?(0\\d{9})$";
            Pattern pattern = Pattern.compile(regexSoDT);
            Matcher matcher = pattern.matcher(soDT);
            if (matcher.matches()) {
                System.out.println("số điện thoại hợp lệ");
                break;
            } else {
                System.out.println("số điện thoại không hợp lệ");
                System.out.println("nhập số điện thoại ");
                soDT = scanner.nextLine();
            }
        }
        System.out.println("nhập email ");
        String email = scanner.nextLine();
        while (true) {
            String regexEmail = "^[w.-]+@([a-zA-Z]{3,6})\\.[a-zA-Z]{2,6}$";
            Pattern pattern = Pattern.compile(regexEmail);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("email hợp lệ");
                break;
            } else {
                System.out.println("email không hợp lệ");
                System.out.println("nhập email");
                email = scanner.nextLine();
            }
        }
        LoaiKhachHang loaiKH = null;
        while (loaiKH == null) {
            System.out.println("nhập loại khách hàng (Diamond, Platinum, Gold, Silver, Member)");
            String input = scanner.nextLine();
            loaiKH = LoaiKhachHang.fromToString(input);
            if (loaiKH == null) {
                System.out.println("vui lòng nhập lại loại khách hàng (Diamond, Platinum, Gold, Silver, Member)");
            }
        }
        System.out.println("nhập địa chỉ khách hàng ");
        String diaChi = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)?(\\s[A-Z][a-z]*)+&";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(diaChi);
            if (matcher.matches()) {
                System.out.println("địa chỉ  hợp lệ");
                break;
            } else {
                System.out.println("địa chỉ không hợp lệ");
                System.out.println("nhập lại địa chỉ");
                diaChi = scanner.nextLine();
            }
        }
        return new KhachHang(maKH, tenKH, ngaySinh, gioiTinh, soCMND, soDT, email, loaiKH, diaChi);
    }
}
