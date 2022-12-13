package step7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1 6 12 18 24
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int cnt = 1;
		int tmp = 1;
		
		while(tmp < num) {
			tmp += 6 * cnt;
			cnt++;
		}
		
		bw.write(cnt + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
