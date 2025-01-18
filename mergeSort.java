public class mergeSort {
    public static void merge(int[] arr1, int m, int mid, int n, int[] c){
        int i = m;
        int j = mid;
        int k = m;
        while (i<mid && j<n) {
            if (arr1[i] <= arr1[j]) {
                c[k] = arr1[i];
                i++;
                k++;
            }
            else{
                c[k] = arr1[j];
                j++;
                k++;
            }

        }
        while (i<mid){
            c[k]=arr1[i];
            i++;
            k++;
        }
        while (j<n){
            c[k]=arr1[j];
            j++;
            k++;
        }
        for (i = m; i < n; i++) {
            arr1[i] = c[i];
        }
    }

    public static void mergeSort(int[] arr1, int left, int right, int[] c) {
        if (right-left <= 1) {
            return;
        }
        else
        {
            int mid = left + (right-left) / 2;
            mergeSort(arr1, left, mid, c);
            mergeSort(arr1, mid, right, c);
            merge(arr1,left, mid, right, c);
        }
    }

    public static void main(String[] args) {
        int arr1[] = {5, 4, 3, 2, 1, 0};
        int left = 0;
        int right = arr1.length;
        int[] c = new int[right];
        mergeSort(arr1, left, right, c);


        for (int num : arr1) {
            System.out.println(num + " ");
        }
    }
}
