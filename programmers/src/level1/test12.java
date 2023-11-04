package level1;

import java.util.Arrays;

public class test12 {
	// �Ҽ� ã��
	// �����佺�׳׽��� ü << ���߿� �ٽ� �˾ƺ� ��
	public int solution(int n) {
		int answer = 0;
		int[] arr = new int[n+1];
		
		for(int i = 2; i < arr.length; i++) {
			if(isPrime(i)) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static boolean isPrime(int num) {
		for(int i = 2; i*i <= num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	// ó�� Ǯ��
	public int solution2(int n) {
		// �ð��ʰ���
        int answer = 0;
        
        for(int i = 2; i <= n; i++) {
        	for(int j = 1; j <= i; j++) {
        		if((j != 1) && (j != i) && (i % j == 0)) {
        			break;
        		}
        		if(i == j) {
        			answer++;
        		}
        	}
        }
        
        return answer;
    }
	
//	public static void main(String[] args) {
//		System.out.println(solution(10));
//	}
}
