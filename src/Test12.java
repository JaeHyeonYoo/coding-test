public class Test12 {
    public static void main(String[] args) {

        int n = 1234;

        Solution12 solution12 = new Solution12();
        System.out.println(solution12.solution(n));
    }
}
//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

//입출력 예
//    n	         result
//   1234	      10
//   930211	      16

class Solution12 {
    public int solution(int n) {
        int answer = 0;

        String s = Integer.toString(n);

        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i, i+1));
            //substring(i,i+1) = i ~ i+1 의 숫자를 잘라서 출력해준다.
            //이를 answer에 더해준다.
        }
        return answer;
    }
}
