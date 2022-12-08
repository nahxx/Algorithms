package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = new String[Integer.parseInt(br.readLine())];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
			int sum = 0;
			for(int j = 0; j < arr[i].length(); j++) {
				int cnt = 0;
				if(arr[i].charAt(j) == 'O') {
					for(int k = j; k >= 0; k--) {
						if(arr[i].charAt(k) == 'O') {
							cnt++;
						} else {
							break;
						}
					}
					sum += cnt;
				}
			}
			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}

}
