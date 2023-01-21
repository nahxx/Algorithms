package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());

		for(int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[Integer.parseInt(st.nextToken())];
			double avg = 0;
			double up = 0;
			
			for(int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				avg += arr[j];
			}
			avg /= arr.length;
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] > avg) {
					up++;
				}
			}
			up = up / arr.length * 100;
			bw.write(String.format("%.3f", up) + "%\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
