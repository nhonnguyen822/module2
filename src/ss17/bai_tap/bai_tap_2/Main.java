package ss17.bai_tap.bai_tap_2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập file nguồn ");
        String pathSource = scanner.nextLine();
        System.out.println("nhập file mục tiêu");
        String pathTarget = scanner.nextLine();
        copyFile(pathSource, pathTarget);
    }

    public static void copyFile(String pathSourceFile, String pathTargetFile) {
        File fileSource = new File(pathSourceFile);
        File fileTarget = new File(pathTargetFile);
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileTarget);

             FileInputStream inputStream = new FileInputStream(fileSource);) {
            byte[] buffer = new byte[1024];
            int read;
            while ((read = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, read);
            }
        } catch (FileNotFoundException e) {
            System.out.println("lỗi đọc file");
        } catch (IOException e) {
            System.out.println("lỗi ghi file");
        }
    }
}
