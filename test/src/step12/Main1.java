package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main1 {

	public static void main(String[] args) throws IOException {
		// M을 넘지않는 3장의 카드 조합 중 가장 M을 넘지 않는 조합 카드 세개의 합 구하기(조합이 없으면 출력x)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(j == i) continue;
				for(int k = 0; k < arr.length; k++) {
					if(k == i || k == j) continue;
					int sum = arr[i] + arr[j] + arr[k];
					if(sum <= m && sum > max) {
						max = sum;
					}
				}
			}
		}
		if (!(max == 0)) bw.write(max + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
