package week6;

import java.util.Arrays;
import java.util.PriorityQueue;

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

    public int[] solutionByQueue(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        int idx = 0;
        for(int[] command : commands){
            int result = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i = command[0]-1; i < command[1];i++){
                pq.add(array[i]);
            }
            for(int i = 0; i < command[2]; i++){
                result = pq.poll();
            }
            answer[idx++] = result;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1},{1, 7, 3}};
        KthNum kthNum = new KthNum();
        int[] answer = kthNum.solutionByQueue(array,commands);
        System.out.println(Arrays.toString(answer));
    }
}
