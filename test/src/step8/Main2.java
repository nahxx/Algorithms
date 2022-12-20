package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// M이상 N이하의 자연수, 소수의 합과 최솟값, 소수가 없을 경우는 첫째 줄에 -1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 0;
		
		for(int i = m; i <= n; i++) {
			if(i == 1) {
				continue;
			}
			int cnt = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					cnt++;
					break;
				}
			}
			if(cnt > 0) {
				continue;
			} else {
				sum += i;
				if(min == 0 || min > i) {
					min = i;
				}
			}
		}
		if(sum == 0 && min == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}

}
