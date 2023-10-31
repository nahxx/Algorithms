package level0;

import java.util.Arrays;

public class test10 {
	// 배열 두배 만들기
    public int[] solution(int[] numbers) {
        int[] answer = Arrays.stream(numbers).map(n -> n * 2).toArray();
        return answer;
    }

}
