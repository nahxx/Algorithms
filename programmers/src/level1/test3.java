package level1;

public class test3 {
	// 가운데 글자 가져오기
	public String solution(String s) {
        int center = s.length() / 2;
        String answer = s.length() % 2 == 0 ? s.substring(center-1, center+1): s.substring(center, center+1);
        return answer;
    }
}
