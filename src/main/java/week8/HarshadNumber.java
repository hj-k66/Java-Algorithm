package week8;

public class HarshadNumber {
    public boolean solution(int x) {

        //1. 자릿수 합 구하기
        int sum = 0;
        int temp = x;
        while(temp != 0){
            sum += temp%10;
            temp /= 10;
        }

        //2. 나누어 떨어지는 검사
        if(x % sum == 0){
            return true;
        }
        return false;

    }

}
