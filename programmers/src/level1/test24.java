package level1;

public class test24 {
	// �ִ������� �ּҰ����
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[0] = getGCD(n, m); // �ִ�����
		answer[1] = n * m / answer[0]; // �ּҰ����
		return answer;
    }
	
	public static int getGCD(int n, int m) {
		if(n % m == 0) {
			return m;
		}
		return getGCD(m, n % m);
	}
}
