package week9;

public class QuickSort2 {
    public int[] sort(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[arr.length / 2];
        int leftIdx = startIdx;
        int rightIdx = endIdx;

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

        return arr;

    }
}
