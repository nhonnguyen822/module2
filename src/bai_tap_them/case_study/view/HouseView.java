package bai_tap_them.case_study.view;

import bai_tap_them.case_study.enity.House;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HouseView {
    public static void display(ArrayList<House> houses) {
        for (int i = 0; i < houses.size(); i++) {
            System.out.println(houses.get(i));
        }
    }


    public static House add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã dịch vụ");
        String serviceCode = scanner.nextLine();
        while (true) {
            String regexRoomID = "^SVHO-\\d{4}$";
            Pattern pattern = Pattern.compile(regexRoomID);
            Matcher matcher = pattern.matcher(serviceCode);
            if (matcher.matches()) {
                System.out.println("mã hợp lệ");
                break;
            } else {
                System.out.println("mã không hợp lệ ");
                System.out.println("vui lòng nhập lại mã dịch vụ");
                serviceCode = scanner.nextLine();
            }
        }
        System.out.println("nhập tên dich vụ");
        String serviceName = scanner.nextLine();
        while (true) {
            String regexName = "^([A-Z][a-z]\\s)+[A-Z][a-z]+$";
            Pattern pattern = Pattern.compile(regexName);
            Matcher matcher = pattern.matcher(serviceName);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("tên không hợp lệ");
                System.out.println("nhập lại tên dich vụ");
                serviceName = scanner.nextLine();
            }
        }
        System.out.println("nhâp diên tich sử dung");
        double usableArea = Double.parseDouble(scanner.nextLine());
        while (usableArea < 30) {
            System.out.println("dien tich sử dụng không thể nhỏ hơn 30m2");
            System.out.println("nhâp lai diên tich sử dung");
            usableArea = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("nhập chi phi thuê");
        double expense = Double.parseDouble(scanner.nextLine());
        while (expense <= 0) {
            System.out.println("nhập lai chi phi thuê");
            expense = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("nhập số lượng người tối đa");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        while (maxPeople < 0 && maxPeople > 20) {
            System.out.println("nhập lai số lượng người tối đa");
            maxPeople = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("nhập kiểu thuê");
        String rentalType = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]+\\s)*[A-Z][a-z]*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(rentalType);
            if (matcher.matches()) {
                System.out.println("kiêu thuê hợp lệ");
                break;
            } else {
                System.out.println("kiểu thuê không hợp lệ");
                System.out.println("nhập lại kiểu thuê");
                rentalType = scanner.nextLine();
            }
        }
        System.out.println("nhập tên chủ nhà");
        String landlordName = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]+\\s)*[A-Z][a-z]*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(landlordName);
            if (matcher.matches()) {
                System.out.println("kiêu thuê hợp lệ");
                break;
            } else {
                System.out.println("kiểu thuê không hợp lệ");
                System.out.println("nhập lại kiểu thuê");
                landlordName = scanner.nextLine();
            }
        }
        System.out.println("nhap so tang");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        while (numberOfFloors < 0) {
            System.out.println("nhap lại số tầng");
            numberOfFloors = Integer.parseInt(scanner.nextLine());
        }
        return new House(serviceCode, serviceName, usableArea, expense, maxPeople, rentalType, landlordName, numberOfFloors);
    }
}
