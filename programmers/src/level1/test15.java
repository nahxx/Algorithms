package level1;

public class test15 {
	// 시저 암호
	public String solution(String s, int n) {
		String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
        	int num = s.charAt(i) == ' ' ? 32 : s.charAt(i) + n;
        	
        	if((s.charAt(i) > 64 && s.charAt(i) < 91) && num > 90) {
        		// 대문자 Z 넘어간 경우
        		num = 64 + (num - 90);
        	} else if((s.charAt(i) > 96 && s.charAt(i) < 123) && num > 122) {
        		// 소문자 z 넘어간 경우
        		num = 96 + (num - 122);
        	}
    		answer += (char)num;
        }
        
        return answer;
    }
}
