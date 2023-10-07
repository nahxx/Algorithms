package level0;

import java.util.Arrays;

public class test2 {
	// 머쓱이보다 키 큰 사람
	public int solution(int[] array, int height) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > height) answer++;
        }
        return answer;
    }
	
	// 231007 stream 활용
	public int solution2(int[] array, int height) {
        int[] arr = Arrays.stream(array).filter(h -> h > height).toArray();
        return arr.length;
	}
}
