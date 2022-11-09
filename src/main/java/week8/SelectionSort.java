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

    public int findMinIndex(int[] arr, int i){
        return findIndex(arr, i, (a, b) -> a > b);
    }
    public int findMaxIndex(int[] arr, int i){
        return findIndex(arr,i, (a, b) -> a < b);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort selectionSort = new SelectionSort();
        for (int i = 0; i < arr.length; i++) {
            int minIdx = selectionSort.findMinIndex(arr,i);
            selectionSort.swap(arr,i,minIdx);
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        for (int i = 0; i < arr2.length; i++) {
            int maxIdx = selectionSort.findMaxIndex(arr2,i);
            selectionSort.swap(arr2,i,maxIdx);
        }
        System.out.println(Arrays.toString(arr2));
    }
}
