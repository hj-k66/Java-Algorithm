package week7.bruteforce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeEratosthenes {
    public static void main(String[] args) {
        int n = 50;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i < n + 1; i++) {
            numbers.add(i);
        }

        for (int num = 2; num * num < n; num++) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % num == 0 && numbers.get(i) != num) {
                    numbers.remove(i);
                }
            }
        }


        System.out.println(numbers.size());
        System.out.println(numbers);
    }
}
