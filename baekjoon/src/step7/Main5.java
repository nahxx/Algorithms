package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// H : 호텔 층수, W : 호텔 방수, N : 몇번째 손님
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int h = 0;
		int w = 0;
		int n = 0;
		int cnt = Integer.parseInt(br.readLine());
		for(int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int room = 0;
			
			if(n % h == 0) {
				room = (h * 100) + (n / h);
			} else {
				room = ((n % h) * 100) + ((n / h) + 1);
			}
			/*
			// 두번째 방법
			int room = 0;
			if(h >= n) {
				room = n * 100 + 1;
			} else {
				if(n % h == 0) {
					room = (h * 100) + (n / h);
				} else {
					room = ((n % h) * 100) + ((n / h) + 1);
				}
			}
			
			// 첫번째 방법
			String room = "";
			if(h >= n) {
				room += n + "01";
			} else {
				//10 30
				// h % n 10
				// n / h 3
				if(n % h == 0) {
					room += h;
					if((n / h) < 10) {
						room += "0" + (n / h);
					} else {
						room += (n / h);
					}
				} else {
					room += n % h;
					if((n / h) < 10 && ((n / h) + 1) < 10) {
						room += "0";
					}
					room += ((n / h) + 1);
				}
			}
			*/
			sb.append(room + "\n");
		}
		System.out.println(sb);
	}

}
