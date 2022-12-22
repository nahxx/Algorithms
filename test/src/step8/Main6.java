package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 짝수 값은 소수의 합, 가장 차이 덜나는 표현으로 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		for(int i = 0; i < cnt; i++) {
			int n = Integer.parseInt(br.readLine());
			boolean[] arr = new boolean[n + 1];
			arr[0] = arr[1] = true;
			
			for(int j = 2; j * j <= n; j++) {
				if(!arr[j]) {
					for(int k = j * j; k <= n; k +=j) {
						arr[k] = true;
					}
				}
			}
			
			String result = "";
			for(int j = n / 2; j > 1; j--) {
				int n1 = j;
				int n2 = n - n1;
				if(!arr[n1] && !arr[n2]) {
					result = (n1 > n2) ? n2 + " " + n1 : n1 + " " + n2;
					break;
				}
			}
			System.out.println(result);
		}

	}

}
