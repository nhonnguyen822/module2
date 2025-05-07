package study.view;

import study.enity.Booking;
import study.enity.Contracts;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContractView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputContractsId() {
        System.out.println("nhập mã hợp đồng muốn sửa");
        return scanner.nextLine();
    }

    public static void displayListBookingNeedContract(Queue<Booking> contractsList) {
        for (Booking contract : contractsList) {
            System.out.println(contract);
        }
    }

    public static void display(Queue<Contracts> contractsQueue) {
        for (Contracts contracts : contractsQueue) {
            System.out.println(contracts);
        }
    }

    public static Contracts inputDataCreatContract(Booking booking) {
        System.out.println("nhập mã hợp đồng ");
        String contractId = scanner.nextLine();
        while (true) {
            String regex = "^HD-\\d{4}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(contractId);
            if (matcher.matches()) {
                System.out.println("mã hợp lệ");
                break;
            } else {
                System.out.println("mã không hợp lệ");
                System.out.println("nhập mã hợp đồng ");
                contractId = scanner.nextLine();
            }
        }
        String bookingCode = booking.getBookingCode();
        System.out.println("nhập tiền cọc");
        int deposit = Integer.parseInt(scanner.nextLine());
        while (deposit <= 0) {
            System.out.println("nhập lại tiền cọc");
            deposit = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("nhập tổng tiền");
        int totalPayment = Integer.parseInt(scanner.nextLine());
        while (totalPayment <= 0) {
            System.out.println("nhập lại tổng tiền ");
            totalPayment = Integer.parseInt(scanner.nextLine());
        }
        return new Contracts(contractId, bookingCode, deposit, totalPayment);
    }

    public static Contracts edit(Contracts contracts) {
        String contractId = contracts.getContractId();
        String bookingCode = contracts.getBookingCode();
        System.out.println("số tiền cọc hiện tại " + contracts.getDeposit());
        System.out.println("nhập thay đổi");
        int deposit = Integer.parseInt(scanner.nextLine());
        while (deposit <= 0) {
            System.out.println("nhập lại tiền cọc");
            deposit = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("tổng số tiền  hiện tại " + contracts.getTotalPayment());
        System.out.println("nhập thay đổi");
        int totalPayment = Integer.parseInt(scanner.nextLine());
        while (totalPayment <= 0) {
            System.out.println("nhập lại tổng số  tiền ");
            totalPayment = Integer.parseInt(scanner.nextLine());
        }
        return new Contracts(contractId, bookingCode, deposit, totalPayment);
    }
}
