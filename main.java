//정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1-num2;

        return answer;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("Hello, GitHub!");
        Solution solution = new Solution();
        int num1 = 30900;
        int num2 = 30300;
        if ( -50000 <= num1 && num1 <= 50000 && num2 <= 50000 && num2 > -50000) {
            System.out.println(solution.solution(num1,num2));
        }
    }
}
