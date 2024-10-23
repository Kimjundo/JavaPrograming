//정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
class Solution5 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 / num2;

        return answer;
    }
}

public class 다섯번째 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int num1 = 10;
        int num2 = 5;
        if( (0 < num1 && num1 <= 100) && (0 < num2 && num2 <= 100) ) {
            System.out.println(solution5.solution(num1, num2));
        }
    }
}
