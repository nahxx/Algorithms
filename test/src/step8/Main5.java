package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// n보다 크고, 2n보다 작거나 같은 소수의 개수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n != 0) {
			boolean[] arr = new boolean[2 * n + 1];
			arr[0] = arr[1] = true; // 소수 아니면 true
			for(int i = 2; i * i < arr.length; i++) {
				if(!arr[i]) {
					for(int j = i * i; j < arr.length; j += i) {
						arr[j] = true;
					}
				}
			}
			int cnt = 0;
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!arr[i]) {
					cnt++;
				}
			}
			System.out.println(cnt);
			n = Integer.parseInt(br.readLine());
		}
	}

}
