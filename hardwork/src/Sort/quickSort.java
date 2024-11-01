package Sort;

public class quickSort {
    private static void quickSort(int[] arr, int l, int r) {
        if (l > r)
            return;
        int pI = partition(arr, l, r);
        quickSort(arr, l, pI - 1);
        quickSort(arr, pI + 1, r);
    }

    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l;
        for (int j = l; j < r; ++j) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 2, 3, 6 };
        quickSort(arr, arr[0], arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
