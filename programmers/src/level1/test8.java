package level1;

public class test8 {
	// ���ڿ� �� p�� y�� ����
    boolean solution(String s) {
    	int p = 0;
    	int y = 0;
    	
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == 'P' || s.charAt(i) == 'p') {
        		p++;
        	} else if(s.charAt(i) == 'Y' || s.charAt(i) == 'y') {
        		y++;
        	}
        }

        return p == y || (p == 0 && y == 0) ? true : false;
    }
}
