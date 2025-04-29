package ss14_thuat_toan_sap_xep.bai_tap.bai_tap_1;

import java.util.Arrays;

public class MoTaThuatToanSapXepChen {
    public static void main(String[] args) {
        insertionSort();
    }

    public static void insertionSort() {
        int[] arr = {1, 0, 3, 3, 5, 1, 8, 10, 9};
        System.out.println("mảng chưa được sắp xếp ");
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int pos = i;;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                System.out.println("di chuyển");
                pos--;
            }
            if (arr[pos] != x) {
                arr[pos] = x;
                System.out.println("mảng đã chèn lần thứ "+i);
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
