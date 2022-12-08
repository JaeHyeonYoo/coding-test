public class Test8 {
    public static void main(String[] args) {

        Solution8 solution8 = new Solution8();
        System.out.println(solution8.solution8("happy birthday!"));
    }
}
class Solution8 {
    public int solution8(String message) {
        int answer = 1;

        answer = message.length();
        answer = answer * 2;

        return answer;
    }
}