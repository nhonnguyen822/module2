package ss13.thuc_hanh.thuc_hanh_1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list,60));

    }

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int height = list.length - 1;
        while (height >= low) {
            int mid = (height + low) / 2;
            if (key < list[mid]) {
                height = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
