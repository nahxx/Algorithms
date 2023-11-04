package level1;

import java.util.Arrays;

public class test11 {
	// 서울에서 김서방 찾기
	// 김서방은 x에 있다
    public String solution(String[] seoul) {
        String answer = "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
        return answer;
    }

}
