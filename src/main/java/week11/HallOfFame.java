package week11;

import java.util.Arrays;
import java.util.PriorityQueue;
/*
[Programmers] 명예의 전당 (1) (https://school.programmers.co.kr/learn/courses/30/lessons/138477)
나의 idea : 우선순위 큐를 이용해 명예의 전당 구성 >> 최하위 점수 peek()
 */
public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            if(hallOfFame.size() < k){
                hallOfFame.add(score[i]);
                answer[i] = hallOfFame.peek();
                continue;
            }
            if(hallOfFame.peek() < score[i]){
                hallOfFame.poll();
                hallOfFame.add(score[i]);
            }
            answer[i] = hallOfFame.peek();


        }

        return answer;
    }

    public static void main(String[] args) {
        HallOfFame hallOfFame = new HallOfFame();
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] result = hallOfFame.solution(k, score);
        System.out.println(Arrays.toString(result));
    }
}
