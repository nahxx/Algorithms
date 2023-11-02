package level1;

import java.util.Arrays;

public class test9 {
	// 문자열 내림차순으로 배치하기
	public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new StringBuilder(new String(arr)).reverse().toString();
    }

}
