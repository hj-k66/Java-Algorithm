package week7.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class PrimeNum01 {
    interface Compare{
        boolean getCondition(int a, int b);
    }

    public boolean isPrime(int num, Compare compare) {
        if(num==2){
            return true;
        }
        for (int i = 2; compare.getCondition(i,num); i++) {
            if (num % i == 0) { //나누어 떨어지는게 하나라도 있으면 소수 x
                return false;
            }
        }
        //다 돌았을 때 나누어떨어지는게 하나도 없었으면 소수 O
        return true;
    }
    public boolean isPrime01(int num){
        return isPrime(num, (a, b) -> a<b);
    }
    public boolean isPrime02(int num){
        return isPrime(num, (a, b) -> a<b/2);
    }

    public boolean isPrime03(int num){
        return isPrime(num, (a, b) -> a < Math.sqrt(b)+1);
    }

    public static void main(String[] args) {
        int[] arr = {27, 13, 17, 19, 23};
        List<Integer> prime = new ArrayList<>();
        PrimeNum01 primeNum01 = new PrimeNum01();
        for (int elem : arr) {
            if (primeNum01.isPrime03(elem)) {
                prime.add(elem);
            }
        }
        System.out.println(prime);
    }


}
