package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[10];
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
			for(int j = 0; j <= i; j++) {
				if(j == i) {
					cnt++;
				}
				if(arr[i] == arr[j]) {
					break;
				}
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
