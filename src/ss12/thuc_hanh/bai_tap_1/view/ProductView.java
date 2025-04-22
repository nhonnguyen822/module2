package ss12.thuc_hanh.bai_tap_1.view;

import ss12.thuc_hanh.bai_tap_1.enity.Product;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductView {
    private static final Scanner scanner = new Scanner(System.in);

    public static void display(List<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public static String inputName() {
        System.out.println("enter name want search");
        return scanner.nextLine();
    }

    //nhap id tim thay doi ,xoa

    public static int inputID() {
        System.out.println("enter ID ");
        int input = Integer.parseInt(scanner.nextLine());
        while (input <= 0) {
            System.out.println("re-enter ID ");
            input = Integer.parseInt(scanner.nextLine());
        }
        return input;
    }

    //nhap them product

    public static Product add() {
        System.out.println("enter id");
        int id = Integer.parseInt(scanner.nextLine());
        while (id <= 0) {
            System.out.println("re-enter id");
            id = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("enter name");
        String name = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]+\\s)*[A-Z][a-z]+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("ok");
                break;
            } else {
                System.out.println();
                System.out.println("re-enter id");
                name = scanner.nextLine();
            }
        }
        System.out.println("enter price");
        int price = Integer.parseInt(scanner.nextLine());
        return new Product(id, name, price);
    }
    // nhap thay doi product

    public static void edit(Product product) {
        System.out.println("id :" + product.getId());
        System.out.println("enter id want change");
        int id = Integer.parseInt(scanner.nextLine());
        while (id <= 0) {
            System.out.println("re-enter id");
            id = Integer.parseInt(scanner.nextLine());
        }
        product.setId(id);
        System.out.println("name :" + product.getName());
        System.out.println("enter name want change");
        String name = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]+\\s)*[A-Z][a-z]+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("ok");
                break;
            } else {
                System.out.println();
                System.out.println("re-enter id");
                name = scanner.nextLine();
            }
        }
        product.setName(name);
        System.out.println("price :" + product.getPrice());
        System.out.println("enter price want change");
        int price = Integer.parseInt(scanner.nextLine());
        while (price <= 0) {
            System.out.println("re-enter price want change");
            price = Integer.parseInt(scanner.nextLine());
        }
        product.setPrice(price);
    }
}
