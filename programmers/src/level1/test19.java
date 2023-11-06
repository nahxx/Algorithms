package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test19 {
	// 자연수 뒤집어 배열로 만들기
	public int[] solution(long n) {
        int[] arr = Arrays.stream(Long.toString(n).split("")).mapToInt(Integer::parseInt).toArray();
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
	
	
}
