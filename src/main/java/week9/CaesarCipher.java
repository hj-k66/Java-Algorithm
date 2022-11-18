package week9;

public class CaesarCipher {
    public static String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char criterion;
            if(c >= 'A' && c <= 'Z'){
                criterion = 'A';

            } else if (c >= 'a' && c <='z') {
                criterion = 'a';
            }
            else{
                answer += Character.toString(c);
                continue;
            }
            char moving = (char)((c + n - criterion) % 26 + criterion);
            answer += Character.toString(moving);



        }
        return answer;
    }

}
