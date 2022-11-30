package week11;

public class SumOfDivisor {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SumOfDivisor sumOfDivisor = new SumOfDivisor();
        System.out.println(sumOfDivisor.solution(12));
    }
}
