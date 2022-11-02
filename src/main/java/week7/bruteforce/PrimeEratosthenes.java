package week7.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class PrimeEratosthenes {
    public int solution(int n) {
        int[] numbers = new int[n-1];
        boolean[] checks = new boolean[n-1];
        int num = 2;
        for (int i = 0; i < n-1 ; i++) {
            numbers[i] = num++;
            checks[i] = true;
        }

        for (int k = 2; k * k < n; k++) {
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] % k == 0 && numbers[i] != k){
                    checks[i] = false;
                }
            }
        }
        //check가 true인 numbers[i] >> 소수
        int answer = 0;
        for (int i = 0; i < n-1 ; i++) {
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
