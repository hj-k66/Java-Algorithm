package week7.bruteforce;

public class Exam {
    public int[] solution(int[] answers) {
        int[] result = {};
        int[] firstStudent = {1,2,3,4,5};
        int[] secondStudent = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdStudent = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        //12345 패턴으로 찍는 학생이 몇 문제 맞췄는지
        int firstStudentAnswerCnt = 0;
        for(int i = 0; i < answers.length;i++){
            if(answers[i]==firstStudent[i]){
                firstStudentAnswerCnt++;
            }
        }
        return result;
    }
}
