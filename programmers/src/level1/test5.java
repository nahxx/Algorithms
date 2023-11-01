package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test5 {
	// 나누어 떨어지는 숫자 배열
	public int[] solution(int[] arr, int divisor) {
        List<Integer> numList = new ArrayList<>();
        
        for(int num : arr) {
        	if(num % divisor == 0) {
        		numList.add(num);
        	}
        }
        
        
        if(numList.size() == 0) {
        	numList.add(-1);
        }
        
        int[] answer = numList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }

}
