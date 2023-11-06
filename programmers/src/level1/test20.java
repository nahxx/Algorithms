package level1;

import java.util.Arrays;
import java.util.Collections;

public class test20 {
	public static long solution(long n) {
        Integer[] arr = Arrays.stream(Long.toString(n).split("")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        return Long.parseLong(Arrays.toString(arr).replaceAll("[^0-9]", ""));
    }
	
	// public static void main(String[] args) {
	// 	System.out.println(solution(118372));
	// }
}
