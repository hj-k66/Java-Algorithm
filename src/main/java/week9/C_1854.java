package week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_1854 {

    public static Long sumDigit(Long n) {
        if (n == 0) return 0L;
        return n % 10 + sumDigit(n / 10);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        Long sumDigit = sumDigit(n);
        System.out.println(sumDigit);

    }
}
