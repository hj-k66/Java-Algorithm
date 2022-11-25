package week10.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gcd {
    public static int gcd(int a, int b){
        if(a==b){
            return a;
        }
        if(a < b){
            return gcd(a,b-a);
        }
       return gcd(a-b,b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        System.out.println(gcd(a, b));

    }
}
