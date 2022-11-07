package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisibleArray {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (int elem:arr) {
            if(elem%divisor == 0){
                answer.add(elem);
            }
        }
        if(answer.size() == 0){
            answer.add(-1);
        }
        //오름차순 정렬
        Collections.sort(answer);
        //리스트를 array로 변환
        int[] result = new int[answer.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}
