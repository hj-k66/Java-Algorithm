package week10.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_1853 {
    static int sum = 0;
    public static void plus(int n){
        if(n == 0) return;
       sum += n;
       plus(n-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        plus(n);
        System.out.println(sum);
    }
}
