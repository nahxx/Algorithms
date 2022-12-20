package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// M이상 N이하의 소수를 모두 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		// 에라토스테네스의 체 활용
		boolean[] arr = new boolean[n + 1];
		arr[0] = arr[1] = true;
		
		for(int i = 2; i * i <= n; i++) {
			if(!arr[i]) {
				for(int j = i * i; j <= n; j += i) {
					arr[j] = true;
				}
			}
		}
		
		for(int i = m; i <= n; i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
		
		/*
		for(int i = m; i <= n; i++) {
			if(i == 1) {
				continue;
			}
			int check = 0;
			for(int j = 2; j <= i/j; j++) {
				if(i % j == 0) {
					check++;
					break;
				}
			}
			if(check > 0) {
				continue;
			}
			System.out.println(i);
		}
		*/
	}

}
