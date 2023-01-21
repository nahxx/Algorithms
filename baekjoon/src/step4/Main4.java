package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = {Integer.parseInt(br.readLine()), 1};
		int n = 0;
		
		for(int i = 1; i < 9; i++) {
			if((n = Integer.parseInt(br.readLine())) > arr[0]) {
				arr[0] = n;
				arr[1] = i + 1;
			}
		}
		
		bw.write(arr[0] + "\n" + arr[1]);
		bw.flush();
		bw.close();
		br.close();
	}

}
