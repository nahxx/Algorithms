package step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main9 {
	// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = {1, 1, 2, 2, 2, 8};
		
		for(int i = 0; i < arr.length; i++) {
			int check = Integer.parseInt(st.nextToken());
			bw.write(arr[i] - check + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
