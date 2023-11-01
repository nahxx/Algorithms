package level1;

import java.util.*;

public class test1 {
	// ÆùÄÏ¸ó
	public int solution(int[] nums) {
        int[] pkm = new int[200001];
        for(int num : nums) {
        	pkm[num] += 1;
        }
        int answer = (int) Arrays.stream(pkm).filter(x -> x > 0).count();
        answer = answer > nums.length / 2 ? nums.length / 2 : answer; 
        return answer;
    }
	
	public int solution2(int[] nums) {
		List<Integer> pkmList = new ArrayList<>();
		
		for(int num : nums) {
			if(!pkmList.contains(num)) {
				pkmList.add(num);
			}
		}
		
		return pkmList.size() > nums.length / 2 ? nums.length / 2 : pkmList.size();
	}
}
