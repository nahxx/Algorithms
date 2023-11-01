package level1;

import java.util.ArrayList;
import java.util.List;

public class test4 {
	// 같은 숫자는 싫어
	public int[] solution(int[] arr) {
		List<Integer> nums = new ArrayList<>();
		nums.add(arr[0]);
		int idx = 1;
		
		while(true) {
			if(idx == arr.length) break;
			if(arr[idx] != arr[idx-1]) {
				nums.add(arr[idx]);
			}
			idx++;
		}
		
		return nums.stream().mapToInt(i -> i).toArray();
    }
	
	public int[] solution2(int[] arr) {
		List<Integer> nums = new ArrayList<>();
		
		int preNum = 10;
		for(int num : arr) {
			if(num != preNum) {
				nums.add(num);
			}
			preNum = num;
		}
		
		return nums.stream().mapToInt(i -> i).toArray();
	}

}
