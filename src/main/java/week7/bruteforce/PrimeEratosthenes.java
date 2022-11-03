package week7.bruteforce;


import java.util.Arrays;;

public class PrimeEratosthenes {
    public int solution(int n) {
        int answer = 0;
        //초기 셋팅
        int[] nums = new int[n-1];
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks, true);
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = i+2;
        }



        return answer;
    }

    public static void main(String[] args) {
        int n = 50;
        for(int i = 2; i <= 100; i++ ){
            System.out.printf("%d, %d\n", i,(i-1)*2);
        }
    }
}
