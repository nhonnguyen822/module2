package menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(".....Menu.....");
            System.out.println("1.display");
            System.out.println("2.add");
            System.out.println("3.delete");
            System.out.println("4.update");
            System.out.println("5.search");
            System.out.println("6.exit");
            System.out.println("enter your chose ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    System.out.println("your chose display");
                    break;
                case 2:
                    System.out.println("your chose add");
                    break;
                case 3:
                    System.out.println("your chose delete");
                    break;
                case 4:
                    System.out.println("your chose update");
                    break;
                case 5:
                    System.out.println("your chose search");
                    break;
                case 6:
                    System.out.println("your chose exit");
                    System.out.println(" DO you want exit ?(Y or N)");
                    String exit = scanner.nextLine();
                    if (exit.equals("Y") || exit.equals("y")) {
                        return;
                    }
                    break;
                default:
                    System.out.println("no chose ");
            }
        }
    }
}
