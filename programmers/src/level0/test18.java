package level0;

import java.util.Arrays;

public class test18 {
	// �迭�� ��հ�
	public double solution(int[] numbers) {
        double answer = (double)Arrays.stream(numbers).sum() / numbers.length;
        return answer;
    }
}
