package week6;

import java.util.HashMap;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        int sum = 0;

        HashMap<Integer,String> hashMap  = new HashMap<>();
        for (String p:participant) {
            int value = p.hashCode();
            hashMap.put(value,p);
            sum += value;
        }
        for(String c : completion){
            sum -= c.hashCode();
        }
        return hashMap.get(sum);
    }

    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};

        Marathon marathon = new Marathon();
        System.out.println(marathon.solution(participant,completion));

    }
}
