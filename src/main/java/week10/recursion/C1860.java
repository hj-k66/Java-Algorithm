package week10.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1860 {
    public static void printFloor(int n){
        if(n==0) return;
        printFloor(n-1);
        printNum(n);
        System.out.println();
    }

    public static void printNum(int k){
        if(k==0) return;
        printNum(k-1);
        System.out.print(k + " ");

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printFloor(n);

    }
}
