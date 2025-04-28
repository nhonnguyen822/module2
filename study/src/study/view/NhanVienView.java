package study.view;

import study.common.GioiTinh;
import study.common.TrinhDo;
import study.common.ViTri;
import study.enity.NhanVien;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NhanVienView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String nhapMaNV() {
        System.out.println("nhập mã nhân viên ");
        return scanner.nextLine();
    }

    //hiển thị danh sach sinh viên
    public static void display(List<NhanVien> nhanVienList) {
        for (int i = 0; i < nhanVienList.size(); i++) {
            System.out.println(nhanVienList.get(i));
        }
    }

    //nhập thông tin nhân viên

    public static NhanVien inputDataKH() {
        System.out.println("nhập mã nhân viên");
        String maNV = scanner.nextLine();
        while (true) {
            String regex = "^NV-\\d{4}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(maNV);
            if (matcher.matches()) {
                System.out.println("mã hợp lệ");
                break;
            } else {
                System.out.println("mã không hợp lệ");
                System.out.println("nhập lại mã nhân viên");
                maNV = scanner.nextLine();
            }
        }
        System.out.println("nhập tên nhân viên");
        String tenNV = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)?(\\s[A-Z][a-z]*)+&";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(tenNV);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("tên không hợp lệ");
                System.out.println("nhập lại tên nhân viên");
                tenNV = scanner.nextLine();
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
            System.out.println("nhập giới tính");
            String input = scanner.nextLine();
            gioiTinh = GioiTinh.fromToString(input);
            if (gioiTinh == null) {
                System.out.println("giới tính không hợp lệ vui lòng nhập lại");
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
        TrinhDo trinhDo = null;
        while (trinhDo == null) {
            System.out.println("nhập trình độ của nhân viên");
            String input = scanner.nextLine();
            trinhDo = TrinhDo.fromString(input);
            if (trinhDo == null) {
                System.out.println("vui lòng nhập chính xác trình độ ");
            }
        }
        ViTri viTri = null;
        while (viTri == null) {
            System.out.println("nhập vị trí  của nhân viên");
            String input = scanner.nextLine();
            viTri = ViTri.fromToString(input);
            if (viTri == null) {
                System.out.println("vui lòng nhập chính xác vị trí ");
            }
        }
        int luong = 0;
        try {
            System.out.println("nhập lương của nhân viên");
            luong = Integer.parseInt(scanner.nextLine());
            while (luong <= 0) {
                System.out.println("nhập lương của nhân viên phai lon hon 0");
                luong = Integer.parseInt(scanner.nextLine());
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        return new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, soCMND, soDT, email, trinhDo, viTri, luong);
    }
}
