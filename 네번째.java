//머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요
class Solution4 {
    public int solution(int age) {
        int answer = 0;
        int years = 2022;
        answer = years - age + 1;
        return answer;
    }
}

public class 네번째 {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        int age = 23;
        if ( 0 < age && age <= 120 ) {
            System.out.println(solution.solution(age));
        }
    }
}
