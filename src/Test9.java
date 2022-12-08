public class Test9 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        System.out.println(solution9.solution(144));
    }
}
class Solution9 {
    public int solution(int n) {
        if(Math.sqrt(n)%1 == 0) return 1;
        return 2;

    }
}
