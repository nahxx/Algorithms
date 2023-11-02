package level1;

public class test10 {
	// 문자열 다루기 기본
	public static boolean solution(String s) {
		if(!(s.length() == 4 || s.length() == 6)) return false;
		
        for(int i = 0; i < s.length(); i++) {
        	if(!((int)s.charAt(i) > 47 && (int)s.charAt(i) < 58)) {
        		return false;
        	}
        }
        return true;
    }
	
//	public static void main(String[] args) {
//		System.out.println(solution("123456z"));
//	}
}
