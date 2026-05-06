public class BubbleSort {

    // buble sort biasa
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // bubble sort optimasi
    public static void bubbleSortOptimized(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Jika tidak ada pertukaran, array sudah terurut
            if (!swapped) break;
        }
    }

    // cetak array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // contoh penggunaan Bubble Sort Biasa
        int[] data1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("=== Bubble Sort Biasa ===");
        System.out.print("Sebelum: ");
        printArray(data1);
        bubbleSort(data1);
        System.out.print("Sesudah: ");
        printArray(data1);

        System.out.println();

        // contoh penggunaan Bubble Sort Optimasi
        int[] data2 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("=== Bubble Sort Optimasi ===");
        System.out.print("Sebelum: ");
        printArray(data2);
        bubbleSortOptimized(data2);
        System.out.print("Sesudah: ");
        printArray(data2);

        System.out.println();

        // array sudah terurut (optimasi langsung berhenti)
        int[] data3 = {1, 2, 3, 4, 5};
        System.out.println("=== Bubble Sort Optimasi (Array Sudah Terurut) ===");
        System.out.print("Sebelum: ");
        printArray(data3);
        bubbleSortOptimized(data3);
        System.out.print("Sesudah: ");
        printArray(data3);
    }
}
