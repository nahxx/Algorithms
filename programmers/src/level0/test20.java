package level0;

public class test20 {
	// 아이스 아메리카노
	public int[] solution(int money) {
		// 잔수, 남은돈
        int[] answer = new int[2];
        int max = 0;
        while(true) {
        	max++;
        	if(5500 * max > money) {
        		answer[0] = --max;
        		answer[1] = money - 5500 * max;
        		break;
        	}
        }
        return answer;
    }

}
