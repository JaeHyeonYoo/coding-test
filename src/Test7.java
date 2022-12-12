public class Test7 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.solution(7,15));
    }
}

//어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
// 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.

//n	t	result
//2	10	2048
//7	15	229,376
class Solution7 {
    public long solution(int n, int t) {
        long answer = n;
        for(int i = 1; i <=t; i++){
            answer = answer * 2 ;
        }
        return answer;
    }
}
