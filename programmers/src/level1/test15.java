package level1;

public class test15 {
	// ���� ��ȣ
	public String solution(String s, int n) {
		String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
        	int num = s.charAt(i) == ' ' ? 32 : s.charAt(i) + n;
        	
        	if((s.charAt(i) > 64 && s.charAt(i) < 91) && num > 90) {
        		// �빮�� Z �Ѿ ���
        		num = 64 + (num - 90);
        	} else if((s.charAt(i) > 96 && s.charAt(i) < 123) && num > 122) {
        		// �ҹ��� z �Ѿ ���
        		num = 96 + (num - 122);
        	}
    		answer += (char)num;
        }
        
        return answer;
    }
}
