package week8;

import java.util.Arrays;

public class SelectionSort {
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int findMinIndex(int[] arr, int i){
        int minIdx = i;
        for(int j = i+1; j < arr.length;j++){
            if(arr[minIdx] > arr[j]){
                minIdx = j;
            }
        }
        return minIdx;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        for (int i = 0; i < arr.length; i++) {
            int minIdx = findMinIndex(arr,i);
            swap(arr,i,minIdx);
        }
        System.out.println(Arrays.toString(arr));
    }
}
