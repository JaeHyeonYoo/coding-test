import java.util.ArrayList;

public class Test2{
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] ex = {1,2,3,4,6,7,8,0};
        //int[] ex2 = {5,8,4,0,6,7,9};

        System.out.println(solution2.solution(ex));
    }
}

//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
// numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

//numbers	result
//[1,2,3,4,6,7,8,0]	14
//[5,8,4,0,6,7,9]	6

class Solution2 {
    public int solution(int[] numbers){

        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= numbers.length - 1; i++) {
            list.add(numbers[i]);
        }
        for (int j = 0; j < 10; j++) {
            if (!(list.contains(j))) {
                answer += j;
            }
        }
        return answer;
    }
}




