package week11;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {7,4,5,9,1,0};

        int[] mem = new int[10];
        Arrays.fill(mem, -1);


        for (int elem : arr) {
            mem[elem] = elem;
        }

        for (int i = 0; i < mem.length; i++) {
            if(mem[i] == -1){
                continue;
            }
            System.out.println(mem[i]);
        }
    }
}
