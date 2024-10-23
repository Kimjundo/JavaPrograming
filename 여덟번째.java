//정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요
class Solution8 {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 + num2;
        return answer;
    }
}

public class 여덟번째 {
    public static void main(String[] args) {
        Solution8 solution = new Solution8();
        int num1 = 2;
        int num2 = 3;
        if (-50000 <= num1 && num1 <= 50000 && num2 <= 50000 && num2 > -50000 ){
            System.out.println(solution.solution(num1, num2));
        }
    }
}
