package week8;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class SelectionSort {
    public interface Compare{
        boolean getCondition(int a, int b);
    }
    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int findIndex(int[] arr, int i, BiFunction<Integer,Integer,Boolean> stmt){
        int idx = i;
        for(int j = i+1; j < arr.length;j++){
            if(stmt.apply(arr[idx], arr[j])){
                idx = j;
            }
        }
        return idx;
    }

    public int[] sort(int arr[], BiFunction<Integer,Integer,Boolean> stmt){
        for (int i = 0; i < arr.length; i++) {
            int idx = findIndex(arr,i,stmt);
            swap(arr,i,idx);
        }
        return arr;
    }



    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort selectionSort = new SelectionSort();
        BiFunction<Integer,Integer,Boolean> ascStmt = (a,b) -> a > b;
        int[] result = selectionSort.sort(arr, ascStmt);
        System.out.println(Arrays.toString(result));

        int[] arr2 = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        BiFunction<Integer,Integer,Boolean> descStmt = (a,b) -> a  <b;
        int[] result2 = selectionSort.sort(arr2, descStmt);
        System.out.println(Arrays.toString(result2));

    }
}
