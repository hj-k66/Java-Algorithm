package week6;

import java.util.Arrays;

public class KthNum {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for(int[] command:commands){
            int i = command[0];
            int j = command[1];
            int k = command[2];
            int[] arr = Arrays.copyOfRange(array,i-1,j );
            Arrays.sort(arr);
            answer[idx++] = arr[k-1];

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1},{1, 7, 3}};
        KthNum kthNum = new KthNum();
        int[] answer = kthNum.solution(array,commands);
        System.out.println(Arrays.toString(answer));
    }
}
