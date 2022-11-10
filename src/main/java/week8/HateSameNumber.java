package week8;

import java.util.ArrayList;
import java.util.List;

public class HateSameNumber {
    public int[] solution(int[] arr) {
        List<Integer> answerNum = new ArrayList<>();
        answerNum.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                answerNum.add(arr[i]);
            }
        }
        int[] answer = new int[answerNum.size()];
        for (int i = 0; i < answerNum.size(); i++) {
            answer[i] = answerNum.get(i);
        }
        return answer;
    }
}
