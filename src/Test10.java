public class Test10 {
    public static void main(String[] args) {

        Solution10 solution10 = new Solution10();
        //System.out.println(solution10.solution("ab6CDE443fgh22iJKlmn1o","6CD"));
        System.out.println(solution10.solution("ppprrrogrammers","pppp"));
    }
}

//문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

class Solution10{
    public int solution(String str1, String str2) {
        int answer = 2;
        if (str1.contains(str2)) {   //contains 함수를 이용해 포함되었는지 확인하기.
            return 1;
        } else {
            return answer;
        }
    }
}
