package level0;

public class test16 {
	// 피자 나눠 먹기(2)
	public int solution(int n) {
        // 최대공약수 구한뒤 최소공배수 구하기
    	int max = 0;
    	for(int i = 1; i <= 6 && i <= n; i++) {
    		if((6 % i == 0) && (n % i == 0)) {
    			max = i;
    		}
    	}
    	return (6 * n / max) / 6;
    }
	
	public int solution2(int n) {
		int max = 1;
		int answer = 0;
		while(true) {
			if(6 * max % n == 0) {
				answer = max;
				break;
			}
			max++;
		}
		return answer;
	}
	
}
