package week8;

import java.util.Arrays;

public class SelectionSort {
    public interface Compare{
        boolean getCondition(int a, int b);
    }
    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int findIndex(int[] arr, int i, Compare compare){
        int idx = i;
        for(int j = i+1; j < arr.length;j++){
            if(compare.getCondition(arr[idx], arr[j])){
                idx = j;
            }
        }
        return idx;
    }

    public int[] sort(int arr[], Compare compare){
        for (int i = 0; i < arr.length; i++) {
            int idx = findIndex(arr,i,compare);
            swap(arr,i,idx);
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.sort(arr, (a,b)-> a > b);
        System.out.println(Arrays.toString(result));

        int[] arr2 = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        int[] result2 = selectionSort.sort(arr2, (a,b) -> a < b);
        System.out.println(Arrays.toString(result2));
    }
}
