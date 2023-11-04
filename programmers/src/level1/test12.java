package level1;

import java.util.Arrays;

public class test12 {
	// 소수 찾기
	// 에라토스테네스의 체 << 나중에 다시 알아볼 것
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
	
	// 처음 풀이
	public int solution2(int n) {
		// 시간초과됨
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
