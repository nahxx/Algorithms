package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test22 {
	// 제일 작은 수 제거하기
	public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.remove(Integer.valueOf(min));
        
        if(list.size() == 0) {
        	list.add(Integer.valueOf(-1));
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
