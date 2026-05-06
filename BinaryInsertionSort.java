public class BinaryInsertionSort {

    // binary search
    private static int binarySearch(int[] arr, int item, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == item) {
                return mid + 1;
            } else if (arr[mid] < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    // binary insertion sort biasa
    public static void binaryInsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int pos = binarySearch(arr, key, 0, i - 1);
            int j = i - 1;
            while (j >= pos) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[pos] = key;
        }
    }

    // binary insertion sort optimasi
    public static void binaryInsertionSortOptimized(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int pos = binarySearch(arr, key, 0, i - 1);
            System.arraycopy(arr, pos, arr, pos + 1, i - pos);
            arr[pos] = key;
        }
    }

    //cetak array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // penggunaan Binary Insertion Sort Biasa
        int[] data1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("=== Binary Insertion Sort Biasa ===");
        System.out.print("Sebelum: ");
        printArray(data1);
        binaryInsertionSort(data1);
        System.out.print("Sesudah: ");
        printArray(data1);

        System.out.println();

        // penggunaan Binary Insertion Sort Optimasi
        int[] data2 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("=== Binary Insertion Sort Optimasi ===");
        System.out.print("Sebelum: ");
        printArray(data2);
        binaryInsertionSortOptimized(data2);
        System.out.print("Sesudah: ");
        printArray(data2);

        System.out.println();

        // array dengan duplikat
        int[] data3 = {5, 3, 8, 3, 1, 9, 2, 5};
        System.out.println("=== Binary Insertion Sort (Array dengan Duplikat) ===");
        System.out.print("Sebelum: ");
        printArray(data3);
        binaryInsertionSortOptimized(data3);
        System.out.print("Sesudah: ");
        printArray(data3);
    }
}
