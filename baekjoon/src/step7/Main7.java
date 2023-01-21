package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 5, 3 최소 설탕개수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = -1;
		
		if(n < 5 && n % 3 != 0) {
			System.out.println(cnt);
			return;
		}
		
		int m = n % 5;
		if(m == 0) {
			cnt = n / 5;
		} else if(m != 0 && m % 3 == 0) {
			cnt = (n / 5) + (m / 3);
		} else {
			int a = 0;
			while(true) {
				m += 5;
				a++;
				if(m > n+1) {
					break;
				}
				if(m % 3 == 0) {
					cnt = ((n / 5) - a) + (m / 3);
					break;
				}
			}
			if(cnt == -1 && n % 3 == 0) {
				cnt = n / 3;
			}
		}
		System.out.println(cnt);
	}

}
