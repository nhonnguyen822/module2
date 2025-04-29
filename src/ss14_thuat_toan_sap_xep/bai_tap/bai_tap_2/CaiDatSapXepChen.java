package ss14_thuat_toan_sap_xep.bai_tap.bai_tap_2;

public class CaiDatSapXepChen {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int x = list[i];
            int pos = i;
            while (pos >= 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            if (list[pos] != x) {
                list[pos] = x;
            }
        }
    }
}
