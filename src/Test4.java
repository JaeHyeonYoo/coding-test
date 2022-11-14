public class Test4 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.solution(13,17));
    }
}
//두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
// 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

//left	right	result
//13	17	      43
//24	27	      52
class Solution4 {
    public int solution(int left, int right) {
        int answer = 0;
        int sum = 0;

        for(int i = left; i <= right; i++){
            for(int j = 1; j <= i; j++){
                if(i%j == 0){
                    sum++;
                }
            }
            if(sum%2 == 0){
                answer += i;
            }else if(sum%2 == 1){
                answer -= i;
            }
            sum = 0;
        }

        return answer;
    }
}
