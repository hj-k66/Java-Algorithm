package week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanceBetweenNode {
    public static int goUp(int a, int b) {
        if (a > b) {
            return goUp(a / 2, b) + 1;
        } else if (a < b) {
            return goUp(a, b / 2) + 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);

        System.out.println(goUp(a, b));

    }
}
