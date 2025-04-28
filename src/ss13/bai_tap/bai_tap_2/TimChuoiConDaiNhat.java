package ss13.bai_tap.bai_tap_2;

public class TimChuoiConDaiNhat {
    public static void main(String[] args) {
        String string = "abcabcdgabxy";
        StringBuilder temp = new StringBuilder(String.valueOf(string.charAt(0)));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) > string.charAt(i - 1)) {
                temp.append(string.charAt(i));
            } else if (stringBuilder.length() < temp.length()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(temp);
                temp = new StringBuilder();
                temp.append(string.charAt(i));
            } else {
                temp = new StringBuilder();
                temp.append(string.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }
}
