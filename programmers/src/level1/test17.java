package level1;

import java.util.Arrays;

public class test17 {
	// 이상한 문자 자르기
	public String solution(String s) {
        String[] sArr = s.split("");
        int idx = 0;
        String answer = "";
        
        for(int i = 0; i < sArr.length; i++) {
        	if(sArr[i].equals(" ")) {
        		answer += " ";
        		idx = 1;
        	}
        	
        	answer += idx % 2 == 0 ? sArr[i].toUpperCase() : sArr[i].toLowerCase();
        	idx++;
        }
        
        return answer;
    }

}
