package week11;

public class CountOfPY {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        String upperCase = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            if(upperCase.charAt(i) == 'P'){
               countP++;
            } else if (upperCase.charAt(i) == 'Y') {
                countY++;
            }

        }

        if(countP != countY) {
            answer = false;
        }
        return answer;
    }
}
