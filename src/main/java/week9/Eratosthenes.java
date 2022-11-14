package week9;

import week7.bruteforce.PrimeEratosthenes;

import java.util.Arrays;

public class Eratosthenes {
    public int solution(int n) {
        int answer = 0;
        //초기 셋팅
        int[] nums = new int[n-1];

        for (int i = 0; i < nums.length ; i++) {
            nums[i] = i+2;
        }


        for(int multipleOf = 2; multipleOf*multipleOf < n; multipleOf++){
            for(int i = (multipleOf-1)*2; i < nums.length; i+=multipleOf){
                nums[i] = 0;
            }
        }


        //nums가 0이 아닌 수가 소수
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 50;
        Eratosthenes eratosthenes = new Eratosthenes();
        System.out.println(eratosthenes.solution(n));
    }
}
