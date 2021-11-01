package challenge27;

public class MergeSort {

    public void mergeSort(int [] arr){
        int n = arr.length;
        if (n < 2 ){
            return;
        }
            int mid = n/2;
            int [] left = new int [mid];
            int [] right = new int[n-mid];

            for (int i = 0 ; i < mid ; i++){
                left [i] = arr [i];
            }

            for (int i = mid; i < n ; i++){
                right [i-mid] = arr[i];
            }
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);

    }

    public static int[] merge(int []arr, int[]left, int[]right){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length){
            if (left[i] <= right[j]){
                arr[k]= left[i];
                i++ ;
            }else {
                arr[k]= right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            arr[k] = left [i];
            i++;
            k++;
        }
        while (j< right.length){
            arr[k] = right [j];
            j++;
            k++;
        }

        return arr;
    }
}
