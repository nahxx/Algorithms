package level0;

import java.util.Arrays;

public class test10 {
	// �迭 �ι� �����
    public int[] solution(int[] numbers) {
        int[] answer = Arrays.stream(numbers).map(n -> n * 2).toArray();
        return answer;
    }

}
