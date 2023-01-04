package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main3 {
	static int[][] arr;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 등수 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		arr = new int[len][3];
		StringTokenizer st;
		
		for(int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		getRank();
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void getRank() throws IOException {
		for(int i = 0; i < arr.length; i++) {
			int k = 0;
			for(int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				if(arr[j][0] > arr[i][0] && arr[j][1] > arr[i][1]) {
					k++;
				}
			}
			arr[i][2] = k + 1;
			bw.write(arr[i][2] + " ");
		}
	}
}
