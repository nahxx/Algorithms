package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int num = 666;
		int cnt = 1;
		int result = 0;
		
		while(true) {
			String str = String.valueOf(num);
			if(str.contains("666")) {
				if(cnt == n) {
					result = num;
					break;
				}
				cnt++;
			}
			num++;
		}
		
		bw.write(result + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
