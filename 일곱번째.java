//정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
class Solution7 {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }
}

public class 일곱번째 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        int num1 =3;
        int num2 = 2;
        if ( ( 0< num1 && num1 <=100 ) && ( 0< num2 && num2 <= 100 ) ) {
            System.out.println(solution7.solution(num1, num2));
        }
    }
}
