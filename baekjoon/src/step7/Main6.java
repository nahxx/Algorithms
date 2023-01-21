package step7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < cnt; i++) {
			int floor = Integer.parseInt(br.readLine()); // 층수
			int n = Integer.parseInt(br.readLine()); // 호수
			int[] arr = new int[n];
			
			if(n == 1) {
				bw.write(n + "\n");
				continue;
			}
			
			for(int j = 0; j < n; j++) {
				arr[j] = j + 1;
			}
			
			for(int j = 0; j < floor; j++) {
				for(int k = 1; k < n; k++) {
					arr[k] = arr[k-1] + arr[k];
				}
			}
			bw.write(arr[arr.length - 1] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}

