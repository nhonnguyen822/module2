package study.view;

import study.common.RentalType;
import study.enity.House;
import study.enity.Room;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RoomView {
    private static final Scanner scanner = new Scanner(System.in);

    public static Room add() {
        System.out.println("nhập mã dich vu");
        String facilityCode = scanner.nextLine();
        while (true) {
            String regex = "SVRO-\\d{4}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(facilityCode);
            if (matcher.matches()) {
                System.out.println("mã hợp lệ");
                break;
            } else {
                System.out.println("mã không hợp lệ");
                System.out.println("nhập mã dich vu");
                facilityCode = scanner.nextLine();
            }
        }
        System.out.println("nhập tên dịch vụ");
        String facilityName = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)?(\\s[A-Z][a-z]*)*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(facilityName);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("tên không hợp lệ");
                System.out.println("nhập tên dịch vụ");
                facilityName = scanner.nextLine();
            }
        }
        System.out.println("nhập diện tích sử dụng");
        double usableArea = Double.parseDouble(scanner.nextLine());
        while (usableArea < 30) {
            System.out.println("diện tích sử dụng không thể nhỏ hơn 30");
            System.out.println("nhập diện tích sử dụng");
            usableArea = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("nhập chi phí thuê");
        int rentalCost = Integer.parseInt(scanner.nextLine());
        while (rentalCost <= 0) {
            System.out.println("chi phí thuê phải lớn hơn 0");
            System.out.println("nhập chi phí thuê");
            rentalCost = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("nhập số lượng người tối đa");
        int maxOfPeople = Integer.parseInt(scanner.nextLine());
        while (maxOfPeople <= 0 || maxOfPeople > 20) {
            System.out.println("số lượng người phải lớn hơn 0 và nhỏ hơn 20");
            System.out.println("nhập số lượng người tối đa");
            maxOfPeople = Integer.parseInt(scanner.nextLine());
        }

        RentalType rentalType = null;
        while (rentalType == null) {
            System.out.println("nhập kiểu thuê");
            String input = scanner.nextLine();
            rentalType = RentalType.fromToString(input);
            if (rentalType == null) {
                System.out.println("kiêu thuê phải year,month ,day ,hour");
            }
        }

        System.out.println("nhập dịch vụ miễn phí ");
        String freeService = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)?(\\s[A-Z][a-z]*)*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(freeService);
            if (matcher.matches()) {
                System.out.println("tên dich vụ hợp lệ");
                break;
            } else {
                System.out.println("tên dịch vụ không hợp lệ");
                System.out.println("nhập lại tên dịch vụ");
                freeService = scanner.nextLine();
            }
        }


        return new Room(facilityCode, facilityName, usableArea, rentalCost, maxOfPeople, rentalType, freeService);
//        return new House(facilityCode, facilityName, usableArea, rentalCost, maxOfPeople, rentalType, roomStandard, numberOfFloors);
    }
}
