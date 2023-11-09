package level1;

public class test24 {
	// 최대공약수와 최소공배수
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[0] = getGCD(n, m); // 최대공약수
		answer[1] = n * m / answer[0]; // 최소공배수
		return answer;
    }
	
	public static int getGCD(int n, int m) {
		if(n % m == 0) {
			return m;
		}
		return getGCD(m, n % m);
	}
}
