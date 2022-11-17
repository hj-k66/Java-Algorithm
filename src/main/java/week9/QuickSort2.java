package week9;

import java.util.Arrays;

public class QuickSort2 {
    public int[] sort(int[] arr, int startIdx, int endIdx) {
        int leftIdx = startIdx;
        int rightIdx = endIdx;
        int pivot = arr[(startIdx+endIdx) / 2];

        while (leftIdx <= rightIdx) {
            while (arr[leftIdx] < pivot) {
                leftIdx += 1;
            }
            while (arr[rightIdx] > pivot) {
                rightIdx -= 1;
            }
            if (leftIdx <= rightIdx) {
                //swap
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx += 1;
                rightIdx -= 1;
            }
        }
        if(startIdx<rightIdx) sort(arr,startIdx,rightIdx);
        if(leftIdx < endIdx) sort(arr,leftIdx,endIdx);

        return arr;

    }

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        QuickSort2 quickSort2 = new QuickSort2();
        var result = quickSort2.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(result));
    }
}
