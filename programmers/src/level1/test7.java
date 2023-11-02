package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test7 {
	// 문자열 내맘대로 정렬하기
	public static String[] solution(String[] strings, int n) {
		List<String> sortWords = Arrays.stream(strings).map(s -> s.substring(n, n+1)).collect(Collectors.toList());
		sortWords = sortWords.stream().distinct().collect(Collectors.toList());
		Collections.sort(sortWords);
		
		List<String> answer = new ArrayList<>();
		for(String word : sortWords) {
			List<String> temps = new ArrayList<>();
			
			for(String s : strings) {
				if(s.substring(n, n+1).equals(word)) {
					temps.add(s);
				}
			}
			Collections.sort(temps);
			answer.addAll(temps);
		}
		
		return answer.toArray(new String[answer.size()]);
    }
	
//	public static void main(String[] args) {
//		String[] arr = {"abcd", "abce", "cdx"};
//		solution(arr, 2);
//	}
}
