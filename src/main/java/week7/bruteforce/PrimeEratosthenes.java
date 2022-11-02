package week7.bruteforce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeEratosthenes {
    public static void main(String[] args) {
        int n = 50;
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i < n+1;i++){
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int elem = iterator.next();
            if (elem%2 == 0 && elem != 2) {
                iterator.remove();
            }
        }

        System.out.println(list.size());
        System.out.println(list);
    }
}
