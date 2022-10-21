package week5.algorithm;

public class SolveBracket {
    public boolean solution(String s){
        //스택 안쓰고 괄호 풀기
        while(s.indexOf("()") >= 0){
            s = s.replace("()","");
        }
        return s.length() == 0;
    }

}
