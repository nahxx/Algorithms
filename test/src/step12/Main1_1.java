package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main1_1 {

	public static void main(String[] args) throws IOException {
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
		
		int sum = blackJack(arr, n, m);
		bw.write(sum + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int blackJack(int[] arr, int n, int m) {
		int max = 0;
		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				for(int k = j + 1; k < n; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if(sum == m) return sum;
					if(sum < m && sum > max) {
						max = sum;
					}
				}
			}
		}
		return max;
	}
}
