//정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
class Solution6 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 * num2;
        return answer;
    }
}

public class 여섯번째 {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        int num1 = 6;
        int num2 = 4;
        if((0 < num1 && num1 <= 100) || (0 < num1 && num2 <= 100)) {
            System.out.println(solution6.solution(num1, num2));
        }
    }
}
