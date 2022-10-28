package week6;

import java.util.HashSet;
import java.util.Set;
//선택 가능한 종류 파악 >> 종류 개수가 length/2보다 작으면 개수리턴, 아니면 length/2리턴
public class Pokemon{
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int n = nums.length / 2;
        //둘 중 최솟값 리턴
        return Math.min(set.size(), n);
    }
}
