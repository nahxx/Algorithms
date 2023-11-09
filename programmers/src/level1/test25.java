package level1;

public class test25 {
	// Äİ¶óÃ÷ ÃßÃø
	public static int solution(int num) {
		if (num == 1) {
			return 0;
		}
		long number = num;
		int cnt = 0;
        while(cnt < 500) {
        	number = number % 2 == 0 ? number / 2 : number * 3 + 1;
        	cnt++;
        	if(number == 1) {
        		return cnt;
        	}
        }
        return -1;
    }
	
//	public static void main(String[] args) {
//		solution(626331);
//	}
}
