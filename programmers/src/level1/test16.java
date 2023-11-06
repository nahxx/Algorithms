package level1;

import java.util.ArrayList;
import java.util.List;

public class test16 {
	// 약수의 합
	public int solution(int n) {
		List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++) {
        	if(n % i == 0) {
        		list.add(i);
        		if(n / i != i) {
        			list.add(n / i);
        		}
        	}
        }
        
        return list.stream().mapToInt(i -> i).sum();
    }
}
