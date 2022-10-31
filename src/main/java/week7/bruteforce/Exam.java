package week7.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam {
    public int getMax(int[] arr){
        int maxValue = arr[0];
        for(int i = 0; i < arr.length;i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] firstStudent = {1 ,2, 3, 4, 5};
        int[] secondStudent = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdStudent = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] result = {0,0,0};

        for(int i = 0; i < answers.length;i++){
            if(answers[i]==firstStudent[i%firstStudent.length]){
                result[0]++;
            }
            if(answers[i]==secondStudent[i%secondStudent.length]){
                result[1]++;
            }
            if(answers[i]==thirdStudent[i%thirdStudent.length]){
                result[2]++;
            }
        }


        int maxValue = getMax(result);
        for(int i = 0; i < result.length;i++){
            if(maxValue==result[i]){
                answer.add(i+1);
            }
        }

        //List를 array로 변환
        int[] arr = new int[answer.size()];
        for(int i = 0; i < answer.size();i++){
            arr[i] = answer.get(i);
        }
        return arr;
    }

}
