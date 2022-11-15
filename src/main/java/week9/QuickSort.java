package week9;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right){
        List<Integer> merged = new ArrayList<>();
        merged.addAll(left);
        merged.addAll(mid);
        merged.addAll(right);
        return merged;
    }

    public  List<Integer> sort(List<Integer> arr){
        if(arr.size()<=1) return arr;
        //pivot 선택
        int pivot = arr.get(arr.size() / 2);
        //pivot기준으로 왼쪽, 오른쪽
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if(pivot > arr.get(i)){
                left.add(arr.get(i));
            } else if (pivot < arr.get(i)) {
                right.add(arr.get(i));
            }else{
                mid.add(arr.get(i));
            }
        }

        return merge(sort(left),mid,sort(right));
    }
    public static void main(String[] args) {
        var arr = new int[]{ 20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> qarr = new ArrayList<>();
        for (int elem: arr) {
            qarr.add(elem);
        }
        QuickSort qs = new QuickSort();
        System.out.println(qs.sort(qarr));

    }
}
