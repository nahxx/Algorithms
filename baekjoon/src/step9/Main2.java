package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {
		// 9x9 최댓값, 위치
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][] arr = new int[9][9];
		int max = -1;
		int n1 = 0;
		int n2 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] > max) {
					max = arr[i][j];
					n1 = i + 1;
					n2 = j + 1;
				}
			}
		}
		sb.append(max + "\n").append(n1 + " " + n2);
		System.out.println(sb);
	}

}
