package level1;

public class test8 {
	// 문자열 내 p와 y의 개수
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
