package week6;

import java.util.HashMap;
import java.util.Map;

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

    public String otherSolution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();
        for(int i = 0; i < participant.length; i++){
            String key = participant[i];
            if(!memo.containsKey(key)){
                memo.put(key,0);
            }
            memo.put(key,memo.get(key)+1);
        }
        for(String comp : completion){
            memo.put(comp, memo.get(comp)-1);
        }
        for(String key : memo.keySet()){
            if(memo.get(key) == 1){
                return key;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};

        Marathon marathon = new Marathon();
        System.out.println(marathon.otherSolution(participant,completion));

    }
}
