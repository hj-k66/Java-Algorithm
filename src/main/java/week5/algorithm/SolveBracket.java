package week5.algorithm;

import java.util.Stack;

public class SolveBracket {
    public boolean solution(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(stack.isEmpty() && ch == ')'){
                return false;
            }
            if(ch == '('){
                stack.push(ch);
            }else{
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public boolean solutionNotStack(String s){
        //스택 안쓰고 괄호 풀기
        while(s.indexOf("()") >= 0){
            s = s.replace("()","");
        }
        return s.length() == 0;
    }

}
