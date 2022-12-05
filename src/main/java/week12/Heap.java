package week12;

import java.util.*;

public class Heap {
    public static int[] getChildIdx(int parentIdx) {
        int[] child = new int[2];
        child[0] = parentIdx * 2 + 1;
        child[1] = parentIdx * 2 + 2;
        return child;
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 7, 8};
        for (int i = arr.length - 1; i > 0; i--) {
            int parentIdx = i / 2;
            if (arr[parentIdx] < arr[i]) {
                int temp = arr[parentIdx];
                arr[parentIdx] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
