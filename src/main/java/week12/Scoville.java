package week12;

import java.util.PriorityQueue;
/*
프로그래머스 Level 2. 더 맵게
나의 idea : 우선순위 큐 이용해 가장 작은값과 두번째로 작은 값 가져오기
>>우선순위 큐에서 가장 작은 값이 K이상이 될 때까지 반복
- 우선순위 큐 사이즈가 1이면 모든 스코빌 지수를 K이상으로 X >> -1 리턴
 */

public class Scoville {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pqScovile = new PriorityQueue<>();
        for (int elem:scoville) {
            pqScovile.add(elem);
        }
        while(pqScovile.peek() < K){
            if(pqScovile.size() == 1){
                return -1;
            }
            int mixScovile = pqScovile.poll() + pqScovile.poll()*2;
            pqScovile.add(mixScovile);
            answer++;
        }
        return answer;
    }
}
