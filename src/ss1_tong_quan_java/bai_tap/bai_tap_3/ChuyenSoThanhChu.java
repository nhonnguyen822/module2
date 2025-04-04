package ss1_tong_quan_java.bai_tap.bai_tap_3;

import java.util.Scanner;

public class ChuyenSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");
        int number = Integer.parseInt(scanner.nextLine());
        if (number <= 10) {
            switch (number) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }
        } else if (number <= 19) {
            switch (number) {
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number <= 99) {
            int chuc = number / 10;
            String hangChuc = "";
            switch (chuc) {
                case 2:
                    hangChuc = "twenty";
                    break;
                case 3:
                    hangChuc = "thirty";
                    break;
                case 4:
                    hangChuc = "forty";
                    break;
                case 5:
                    hangChuc = "fifty";
                    break;
                case 6:
                    hangChuc = "sixty";
                    break;
                case 7:
                    hangChuc = "seventy";
                    break;
                case 8:
                    hangChuc = "eighty";
                    break;
                case 9:
                    hangChuc = "ninety";
                    break;
            }
            int donVi = number % 10;
            String hangDonVi = "";
            switch (donVi) {
                case 1:
                    hangDonVi = "one";
                    break;
                case 2:
                    hangDonVi = "two";
                    break;
                case 3:
                    hangDonVi = "three";
                    break;
                case 4:
                    hangDonVi = "fort";
                    break;
                case 5:
                    hangDonVi = "five";
                    break;
                case 6:
                    hangDonVi = "six";
                    break;
                case 7:
                    hangDonVi = "seven";
                    break;
                case 8:
                    hangDonVi = "eight";
                    break;
                case 9:
                    hangDonVi = "nine";
                    break;
            }
            System.out.println(hangChuc + hangDonVi);
        } else if (number <= 999) {
            int tram = number / 100;
            String hangTram = "";
            switch (tram) {
                case 1:
                    hangTram = "one";
                    break;
                case 2:
                    hangTram = "two";
                    break;
                case 3:
                    hangTram = "three";
                    break;
                case 4:
                    hangTram = "four";
                    break;
                case 5:
                    hangTram = "five";
                    break;
                case 6:
                    hangTram = "six";
                    break;
                case 7:
                    hangTram = "seven";
                    break;
                case 8:
                    hangTram = "eight";
                    break;
                case 9:
                    hangTram = "nine";
                    break;
            }
            int chuc = number % 100 / 10;
            String hangChuc = "";
            switch (chuc) {
                case 2:
                    hangChuc = "twenty";
                    break;
                case 3:
                    hangChuc = "thirty";
                    break;
                case 4:
                    hangChuc = "forty";
                    break;
                case 5:
                    hangChuc = "fifty";
                    break;
                case 6:
                    hangChuc = "sixty";
                    break;
                case 7:
                    hangChuc = "seventy";
                    break;
                case 8:
                    hangChuc = "eighty";
                    break;
                case 9:
                    hangChuc = "ninety";
                    break;
            }
            int donVi = number % 10;
            String hangDonVi = "";
            switch (donVi) {
                case 1:
                    hangDonVi = "one";
                    break;
                case 2:
                    hangDonVi = "two";
                    break;
                case 3:
                    hangDonVi = "three";
                    break;
                case 4:
                    hangDonVi = "fort";
                    break;
                case 5:
                    hangDonVi = "five";
                    break;
                case 6:
                    hangDonVi = "six";
                    break;
                case 7:
                    hangDonVi = "seven";
                    break;
                case 8:
                    hangDonVi = "eight";
                    break;
                case 9:
                    hangDonVi = "nine";
                    break;
            }
            System.out.println(hangTram + "hunrted " + hangChuc + " " + hangDonVi);

        } else {
            System.out.println("re-enter");
        }
    }
}

