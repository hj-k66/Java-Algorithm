package week10.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_1853 {
    public static int plus(int n){
        if(n == 0) return 0;
        return n + plus(n-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = plus(n);
        System.out.println(sum);
    }
}
