package Sort;

public class bubbleSort {
    public static void bubleSort(int arr[]) {
        int i, j, temp;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 2, 3, 6 };
        bubleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
