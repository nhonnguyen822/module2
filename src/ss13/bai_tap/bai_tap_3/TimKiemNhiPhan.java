package ss13.bai_tap.bai_tap_3;

import java.lang.reflect.Array;

public class TimKiemNhiPhan {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9,};
        int left = 0;
        int right = arr.length;
        int result = timKiem(arr, 10, left, right);
        System.out.println(result);
    }

    public static int timKiem(int[] ints, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left+right) / 2;
        if (ints[mid] == target) {
            return mid;
        } else if (ints[mid] < target) {
            right = mid - 1;
            return timKiem(ints, target, left, right);
        } else {
            return timKiem(ints, target, mid + 1, right);
        }
    }
}
