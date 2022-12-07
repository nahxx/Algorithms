package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main12 {
	// 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int check = n;
		int ten = 0;
		int one = 0;
		
		
		while(true) {
			ten = check / 10;
			one = check % 10;
			check = (one * 10) + ((ten + one) % 10);
			cnt++;
			if(check == n) {
				bw.write(cnt + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
