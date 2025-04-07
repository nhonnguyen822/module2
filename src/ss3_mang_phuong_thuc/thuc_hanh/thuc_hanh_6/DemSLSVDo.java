package ss3.mang.thuc_hanh.thuc_hanh_6;

import java.util.Arrays;
import java.util.Scanner;

public class DemSLSVDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input size element in array");
        int size = Integer.parseInt(scanner.nextLine());
        while (size <= 0 || size > 30) {
            System.out.println("Size should not exceed 30");
            size = Integer.parseInt(scanner.nextLine());
        }
        int[] studentTestScores = new int[size];
        for (int i = 0; i < studentTestScores.length; i++) {
            do {
                System.out.println("enter score student " + (i + 1));
                studentTestScores[i] = Integer.parseInt(scanner.nextLine());
            } while (studentTestScores[i] < 0 || studentTestScores[i] > 10);
        }
        System.out.println(Arrays.toString(studentTestScores));
        int count = 0;
        for (int i = 0; i < studentTestScores.length; i++) {
            if (studentTestScores[i] >= 5) {
                count++;
            }
        }
        if (count==0){
            System.out.println("is not student pass the exam");
        }else {
            System.out.println("The number of students passing the exam is "+count);
        }
    }
}
