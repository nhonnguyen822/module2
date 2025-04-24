package ss16.bai_tap;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập source file ");
        String sourceFile = scanner.nextLine();
        System.out.println("nhập target file");
        String targetFile = scanner.nextLine();
        copyFile(sourceFile, targetFile);
    }

    public static void copyFile(String pathFileSource, String pathFileTarget) {
        File sourceFile = new File(pathFileSource);
        File targetFile = new File(pathFileTarget);
        try (FileReader fileReader = new FileReader(sourceFile);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(targetFile);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            System.out.println("lỗi đường dẫn");
        }
    }
}
