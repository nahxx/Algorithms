package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test3 {
	
	public static int han(int n) {
		if(n < 100) {
			return n;
		}
		
		int cnt = 99;
		for(int i = 100; i <= n; i++) {
			int h = i / 100;
			int t = (i % 100) / 10;
			int o = i % 10;
			
			if((h - t) == (t - o)) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		bw.write(han(input) + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
