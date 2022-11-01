package week7.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class PrimeNum01 {
    public boolean isPrime(int num) {
        if(num==2){
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {13, 17, 19, 23};
        List<Integer> prime = new ArrayList<>();
        PrimeNum01 primeNum01 = new PrimeNum01();
        for (int elem : arr) {
            if (primeNum01.isPrime(elem)) {
                prime.add(elem);
            }
        }
        System.out.println(prime);
    }


}
