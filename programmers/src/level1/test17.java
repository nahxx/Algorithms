package level1;

import java.util.Arrays;

public class test17 {
	// �̻��� ���� �ڸ���
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
