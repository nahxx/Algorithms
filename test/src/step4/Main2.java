package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[Integer.parseInt(st.nextToken())];
		int x = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] < x) {
				bw.write(arr[i] + " ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
