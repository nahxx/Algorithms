package level1;

import java.util.Arrays;

public class test18 {
	// �ڸ��� ���ϱ�
	public int solution(int n) {
        String[] nArr = Integer.toString(n).split("");
        return Arrays.stream(nArr).mapToInt(i -> Integer.parseInt(i)).sum();
	}
	
	public int solution2(int n) {
		int answer = 0;
		
		String[] arr = Integer.toString(n).split("");
        for(String s : arr) {
        	answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}
