package week10.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1904 {
    public static void printOdd(int a, int b){
        if(a>b) return;
        if(a%2!=0){
            System.out.print(a + " ");
        }
        printOdd(a+1,b);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        printOdd(a,b);
    }
}
