package week7.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class PrimeEratosthenes {
    public int solution(int n) {
        boolean[] checks = new boolean[n-2];
        int answer = 0;
        for (int i = 0; i < checks.length ; i++) {
            checks[i] = true;
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
