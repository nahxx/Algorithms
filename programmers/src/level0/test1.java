package level0;

import java.util.Arrays;

public class test1 {
	// �ߺ��� ���� ����
	public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) answer++;
        }
        return answer;
    }
	
	public int solution2(int[] array, int n) {
		// 231007 stream Ȱ��
		int[] arr = Arrays.stream(array).filter(m -> m == n).toArray();
		return arr.length;
	}
}
