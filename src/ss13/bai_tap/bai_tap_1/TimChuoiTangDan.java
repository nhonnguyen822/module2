package ss13.bai_tap.bai_tap_1;

import java.util.Scanner;

public class TimChuoiTangDan {
    public static void main(String[] args) {
        String string = "Welcome";
        char min = string.charAt(0);
        StringBuilder result = new StringBuilder(String.valueOf(min));
        for (int i = 1; i < string.length(); i++) {
            if(min<string.charAt(i)){
                result.append(string.charAt(i));
                min=string.charAt(i);
            }
        }
        System.out.println(result);
    }
}
