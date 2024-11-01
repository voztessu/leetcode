package Sort;

public class mergeSort {
    public static void merge(int[] arr, int l, int m, int r) {
        // Kích thước của hai mảng phụ
        int n1 = m - l + 1;
        int n2 = r - m;

        // Tạo các mảng phụ
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Sao chép dữ liệu vào các mảng phụ
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        // Gộp các mảng phụ trở lại mảng chính
        int i = 0, j = 0;
        int k = l;
        while (i < n1 || j < n2) {
            if (i < n1 && (j >= n2 || L[i] <= R[j])) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // find the middle point
            int m = l + (r - l) / 2;
            // sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            // merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 2, 3, 6 };
        mergeSort(arr, arr[0], arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
