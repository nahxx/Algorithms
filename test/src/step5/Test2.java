package step5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test2 {
	
	public static int d(int n) {
		int dn = 0;
		if(n > 99 && n < 1000) {
			dn = n + (n / 100) + ((n % 100) / 10) + (n % 10);
		} else if(n > 999 && n < 10000) {
			dn = n + (n / 1000) + ((n % 1000) / 100) + ((n % 100) / 10) + (n % 10);
		} else if(n < 100) {
			dn = n + (n / 10) + (n % 10);
		}
		
		/*
		// while 사용 방법 (더 간단)
		dn = n;
		while(n != 0) {
			dn += n % 10;
			n /= 10;
		}
		*/
		return dn;
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] arr = new boolean[10001];
		
		for(int i = 0; i < arr.length; i++) {
			if(d(i) < arr.length) {
				arr[d(i)] = true;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == false) {
				bw.write((i) + "\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
