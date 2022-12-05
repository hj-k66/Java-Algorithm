package week12;

import java.util.*;

public class Heap {
    public static void main(String[] args) {
        int[] arr = {6,5,7,8};
        for (int i = arr.length-1; i > 0 ; i--) {
            int parent = arr[i/2];
            if(arr[i/2] < arr[i]){
                int temp = arr[i/2];
                arr[i/2] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
