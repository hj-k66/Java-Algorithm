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


        for(int multipleOf = 2; multipleOf*multipleOf < n; multipleOf++){
            for(int i = (multipleOf-1)*2; i < nums.length; i+=multipleOf){
                checks[i] = false;
            }
        }


        //checks가 true인 수가 소수
        for(int i = 0; i < nums.length; i++){
            if(checks[i]){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 50;
        PrimeEratosthenes pe = new PrimeEratosthenes();
        System.out.println(pe.solution(n));
    }
}
